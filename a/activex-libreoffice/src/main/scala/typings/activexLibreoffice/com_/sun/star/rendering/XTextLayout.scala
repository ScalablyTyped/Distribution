package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealRectangle2D
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the central interface for text layouting.
  *
  * This is the central interface for text-related tasks more complicated than simple string rendering. Note that all query methods are subject to the
  * current layout state of this object. That is, calls to {@link XTextLayout.justify()} or {@link XTextLayout.applyLogicalAdvancements()} are likely to
  * change subsequent output of those query methods.
  *
  * Similar to {@link XCanvasFont} , all measurements and coordinates accepted and returned by this interface are relative to the font's local coordinate
  * system (which only equals device coordinate space, if the combined render transformation used during text output is the identity transformation).
  * Conversely, if the combined transformation used during text output is **not** the identity transformation, all measurements returned by this interface
  * should be subjected to that transformation, to yield values in device coordinate space. Depending on the underlying font technology, actual device
  * output might be off by up to one device pixel from the transformed metrics.
  * @since OOo 2.0
  */
@js.native
trait XTextLayout extends XInterface {
  
  /**
    * This method yields the baseline offset.
    *
    * This method returns the baseline offset for this layout object, either measured from the top or the left edge, depending on the writing direction
    * (horizontally or vertically). Since rendering this layout via {@link XCanvas.drawTextLayout()} outputs relative to the layout object's baseline, this
    * method can be used to e.g. output relative to the left, top edge.
    * @returns the distance of the main baseline from the top or the left edge of this object, depending on the writing direction.
    */
  val BaselineOffset: Double = js.native
  
  /**
    * Request the associated font for this layout.
    * @returns the associated font for this layout.
    */
  val Font: XCanvasFont = js.native
  
  /**
    * This method returns the main writing direction.
    *
    * This method returns the main writing direction of this layout, i.e. either LEFT_TO_RIGHT or RIGHT_TO_LEFT.
    * @returns the main text direction of this layout.
    */
  val MainTextDirection: Double = js.native
  
  /**
    * Request the text this layout contains.
    * @returns the text this layout contains.
    */
  val Text: StringContext = js.native
  
  /**
    * Apply explicit advancements for every character in the layout string.
    *
    * This method applies the specified advancements to every logical character in the input string ( **not** for every glyph. There might be multiple
    * glyphs per input character, or multiple input characters per glyph). This is useful to explicitly manipulate the exact output positions of characters,
    * e.g. relative to a reference output device.
    * @param aAdvancements A sequence of character advancements, in font coordinate space.
    * @see XTextLayout.queryLogicalAdvancements()
    * @throws com::sun::star::lang::IllegalArgumentException if the size of aAdvancements does not match the number of characters in the text.
    */
  def applyLogicalAdvancements(aAdvancements: SeqEquiv[Double]): Unit = js.native
  
  /**
    * Justify a number of text layouts to the given size.
    *
    * This method can be used to combine the layout of a text line into a single justification run. This is e.g. useful if the line consists of several text
    * portions (e.g. because of different fonts or colors), but it is desirable to spread the available space more globally across the different layout
    * objects. If, for example, one layout object contains significantly more whitespace or Kashidas than the rest, this method can assign proportionally
    * more space to this layout object.
    * @param aNextLayouts A sequence of layouts following this one in logical text order.
    * @param nSize The requested size of the text for **all** XTextLayouts after justification in font coordinate space (either width or height, depending on
    * @returns the actual size of the text after the justification, in font coordinate space. Depending on the font and the script type, this might be somewhat
    * @throws com::sun::star::lang::IllegalArgumentException if one of the parameters are not in the valid range.
    */
  def combinedJustify(aNextLayouts: SeqEquiv[XTextLayout], nSize: Double): Double = js.native
  
  /**
    * This method yields the baseline offset.
    *
    * This method returns the baseline offset for this layout object, either measured from the top or the left edge, depending on the writing direction
    * (horizontally or vertically). Since rendering this layout via {@link XCanvas.drawTextLayout()} outputs relative to the layout object's baseline, this
    * method can be used to e.g. output relative to the left, top edge.
    * @returns the distance of the main baseline from the top or the left edge of this object, depending on the writing direction.
    */
  def getBaselineOffset(): Double = js.native
  
  /**
    * This method converts an insertion index to a caret.
    *
    * This method generates caret information for a given insertion point in the layout text.
    * @param nInsertionIndex The insertion index, as e.g. returned by {@link XTextLayout.getTextHit()} . This value must be in the range 0 up to the number of
    * @param bExcludeLigatures Set this to `TRUE` to skip the positions inside ligatures as valid caret placements. For example, this would avoid setting the
    * @returns the generated {@link Caret} structure.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nInsertionIndex is outside the permissible range.
    */
  def getCaret(nInsertionIndex: Double, bExcludeLigatures: Boolean): Caret = js.native
  
  /**
    * Request the associated font for this layout.
    * @returns the associated font for this layout.
    */
  def getFont(): XCanvasFont = js.native
  
  /**
    * This method returns the main writing direction.
    *
    * This method returns the main writing direction of this layout, i.e. either LEFT_TO_RIGHT or RIGHT_TO_LEFT.
    * @returns the main text direction of this layout.
    */
  def getMainTextDirection(): Double = js.native
  
  /**
    * This method calculates a new insertion index.
    *
    * This method calculates a new insertion index, given a start index and the number of characters to skip. This is most useful for caret traveling.
    * @param nStartIndex The insertion index to start from.
    * @param nCaretAdvancement For values greater than 0, the caret is visually moved to the right. For values smaller than 0, the caret is visually moved to
    * @param bExcludeLigatures Set this to `TRUE` to skip the positions inside ligatures as valid caret placements. For example, this would avoid setting the
    * @returns the new insertion index.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nStartIndex or nCaretAdvancement is outside the permissible range.
    */
  def getNextInsertionIndex(nStartIndex: Double, nCaretAdvancement: Double, bExcludeLigatures: Boolean): Double = js.native
  
  /**
    * Request the text this layout contains.
    * @returns the text this layout contains.
    */
  def getText(): StringContext = js.native
  
  /**
    * This method determines the hit position in the text.
    *
    * This method determines the index of the character hit at the specified position (in font coordinate space).
    * @param aHitPoint The position in font coordinate space to determine the underlying character index for.
    */
  def getTextHit(aHitPoint: RealPoint2D): TextHit = js.native
  
  /**
    * Justify the text to the given size.
    *
    * This method is the core of the {@link XTextLayout} interface, because it layouts the text in a typographically correct way into the available space.
    * @param nSize The requested size of the text after justification (either width or height, depending on the writing mode). This parameter is interpreted i
    * @returns the actual size of the text after the justification in the font coordinate space. Depending on the font and the script type, this might be somewh
    * @throws com::sun::star::lang::IllegalArgumentException if nSize is 0 or negative.
    */
  def justify(nSize: Double): Double = js.native
  
  /**
    * Query the ink bounding boxes for every glyph in the layouted text.
    *
    * Ink, or tight bounding boxes in this case means that for e.g. an "a", the bounding box for the {@link XPolyPolygon2D} describing the glyph "a" is
    * returned, not the logical dimensions of the character in the font.
    * @returns a sequence of rectangles in font coordinate space, specifying the bounds, one for every glyph.
    * @see XTextLayout.queryMeasures()
    */
  def queryInkMeasures(): SafeArray[RealRectangle2D] = js.native
  
  /**
    * Query the advancements for every character in the input string.
    *
    * This method returns a sequence of advancements, one for each character in the input string ( **not** for every glyph. There might be multiple glyphs
    * per input character, or multiple input characters per glyph). Adding up all advancements yields the total advancement of this layout. To manipulate
    * the layout of a string on the level of characters, this method can be used to query for the layout's default advancements, which can subsequently be
    * changed and applied to the layout via {@link XTextLayout.applyLogicalAdvancements()} .
    * @returns a sequence of double specifying the advancements per character in font coordinate space.
    * @see XTextLayout.applyLogicalAdvancements()
    */
  def queryLogicalAdvancements(): SafeArray[Double] = js.native
  
  /**
    * This method generates a highlight polygon.
    *
    * This method generates a highlighting polygon from two insertion indices. This polygon will not always be visually continuous, if e.g. the text
    * direction changes in the middle of the selection, the might be parts visually between start and end position that are not selected.
    * @param nStartIndex Start of the selection range.
    * @param nEndIndex End of the selection range.
    * @returns the highlight polygon in the font coordinate space.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nStartIndex or nEndIndex are outside the permissible range.
    */
  def queryLogicalHighlighting(nStartIndex: Double, nEndIndex: Double): XPolyPolygon2D = js.native
  
  /**
    * Query the logical bounding boxes of every character in the given text string.
    *
    * Logical bounding boxes means the space that the font allocates for the given character, which, e.g. for a ".", might be significantly broader than the
    * bounds returned via {@link XTextLayout.queryInkMeasures()} .
    * @returns a sequence of rectangles specifying the bounds in font coordinate space, one for every glyph.
    * @see XTextLayout.queryInkMeasures()
    */
  def queryMeasures(): SafeArray[RealRectangle2D] = js.native
  
  /**
    * Query the overall bounding box of the text.
    *
    * This method is similar to XTextLayout::queryTextMeasures(), only that the overall bounds are returned by this method.
    * @returns the overall bounding box for the given layout, in font coordinate space.
    */
  def queryTextBounds(): RealRectangle2D = js.native
  
  /**
    * Extract the polygonal shapes of the layouted text.
    *
    * Each glyph is represented by a separate {@link XPolyPolygon2D} in the returned sequence.
    * @returns a sequence of {@link XPolyPolygon2D} in font coordinate space, one for every glyph.
    */
  def queryTextShapes(): SafeArray[XPolyPolygon2D] = js.native
  
  /**
    * This method generates a highlight polygon.
    *
    * This method generates a highlighting polygon from two insertion indices. This polygon will be visually continuous, i.e. will not have non-highlighted
    * text in between.
    * @param nStartIndex Start of the selection range.
    * @param nEndIndex End of the selection range.
    * @returns the highlight polygon in the font coordinate space.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nStartIndex or nEndIndex are outside the permissible range.
    */
  def queryVisualHighlighting(nStartIndex: Double, nEndIndex: Double): XPolyPolygon2D = js.native
}
object XTextLayout {
  
  @scala.inline
  def apply(
    BaselineOffset: Double,
    Font: XCanvasFont,
    MainTextDirection: Double,
    Text: StringContext,
    acquire: () => Unit,
    applyLogicalAdvancements: SeqEquiv[Double] => Unit,
    combinedJustify: (SeqEquiv[XTextLayout], Double) => Double,
    getBaselineOffset: () => Double,
    getCaret: (Double, Boolean) => Caret,
    getFont: () => XCanvasFont,
    getMainTextDirection: () => Double,
    getNextInsertionIndex: (Double, Double, Boolean) => Double,
    getText: () => StringContext,
    getTextHit: RealPoint2D => TextHit,
    justify: Double => Double,
    queryInkMeasures: () => SafeArray[RealRectangle2D],
    queryInterface: `type` => js.Any,
    queryLogicalAdvancements: () => SafeArray[Double],
    queryLogicalHighlighting: (Double, Double) => XPolyPolygon2D,
    queryMeasures: () => SafeArray[RealRectangle2D],
    queryTextBounds: () => RealRectangle2D,
    queryTextShapes: () => SafeArray[XPolyPolygon2D],
    queryVisualHighlighting: (Double, Double) => XPolyPolygon2D,
    release: () => Unit
  ): XTextLayout = {
    val __obj = js.Dynamic.literal(BaselineOffset = BaselineOffset.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], MainTextDirection = MainTextDirection.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), applyLogicalAdvancements = js.Any.fromFunction1(applyLogicalAdvancements), combinedJustify = js.Any.fromFunction2(combinedJustify), getBaselineOffset = js.Any.fromFunction0(getBaselineOffset), getCaret = js.Any.fromFunction2(getCaret), getFont = js.Any.fromFunction0(getFont), getMainTextDirection = js.Any.fromFunction0(getMainTextDirection), getNextInsertionIndex = js.Any.fromFunction3(getNextInsertionIndex), getText = js.Any.fromFunction0(getText), getTextHit = js.Any.fromFunction1(getTextHit), justify = js.Any.fromFunction1(justify), queryInkMeasures = js.Any.fromFunction0(queryInkMeasures), queryInterface = js.Any.fromFunction1(queryInterface), queryLogicalAdvancements = js.Any.fromFunction0(queryLogicalAdvancements), queryLogicalHighlighting = js.Any.fromFunction2(queryLogicalHighlighting), queryMeasures = js.Any.fromFunction0(queryMeasures), queryTextBounds = js.Any.fromFunction0(queryTextBounds), queryTextShapes = js.Any.fromFunction0(queryTextShapes), queryVisualHighlighting = js.Any.fromFunction2(queryVisualHighlighting), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextLayout]
  }
  
  @scala.inline
  implicit class XTextLayoutOps[Self <: XTextLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaselineOffset(value: Double): Self = this.set("BaselineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: XCanvasFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTextDirection(value: Double): Self = this.set("MainTextDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: StringContext): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyLogicalAdvancements(value: SeqEquiv[Double] => Unit): Self = this.set("applyLogicalAdvancements", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCombinedJustify(value: (SeqEquiv[XTextLayout], Double) => Double): Self = this.set("combinedJustify", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBaselineOffset(value: () => Double): Self = this.set("getBaselineOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCaret(value: (Double, Boolean) => Caret): Self = this.set("getCaret", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFont(value: () => XCanvasFont): Self = this.set("getFont", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMainTextDirection(value: () => Double): Self = this.set("getMainTextDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNextInsertionIndex(value: (Double, Double, Boolean) => Double): Self = this.set("getNextInsertionIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetText(value: () => StringContext): Self = this.set("getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextHit(value: RealPoint2D => TextHit): Self = this.set("getTextHit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJustify(value: Double => Double): Self = this.set("justify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryInkMeasures(value: () => SafeArray[RealRectangle2D]): Self = this.set("queryInkMeasures", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryLogicalAdvancements(value: () => SafeArray[Double]): Self = this.set("queryLogicalAdvancements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryLogicalHighlighting(value: (Double, Double) => XPolyPolygon2D): Self = this.set("queryLogicalHighlighting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueryMeasures(value: () => SafeArray[RealRectangle2D]): Self = this.set("queryMeasures", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryTextBounds(value: () => RealRectangle2D): Self = this.set("queryTextBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryTextShapes(value: () => SafeArray[XPolyPolygon2D]): Self = this.set("queryTextShapes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryVisualHighlighting(value: (Double, Double) => XPolyPolygon2D): Self = this.set("queryVisualHighlighting", js.Any.fromFunction2(value))
  }
}
