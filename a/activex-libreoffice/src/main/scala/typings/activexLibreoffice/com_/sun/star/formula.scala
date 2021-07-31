package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.accessibility.TextSegment
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleComponent
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventBroadcaster
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventListener
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleRelationSet
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleStateSet
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleText
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formula {
  
  /**
    * The accessible view of a formula documents command text.
    * @since OOo 1.1.2
    */
  trait AccessibleFormulaText
    extends StObject
       with XAccessible
       with XAccessibleComponent
       with XAccessibleContext
       with XAccessibleEventBroadcaster
  object AccessibleFormulaText {
    
    @scala.inline
    def apply(
      AccessibleChildCount: Double,
      AccessibleContext: XAccessibleContext,
      AccessibleDescription: String,
      AccessibleIndexInParent: Double,
      AccessibleName: String,
      AccessibleParent: XAccessible,
      AccessibleRelationSet: XAccessibleRelationSet,
      AccessibleRole: Double,
      AccessibleStateSet: XAccessibleStateSet,
      Background: Color,
      Bounds: Rectangle,
      Foreground: Color,
      Locale: Locale,
      Location: Point,
      LocationOnScreen: Point,
      Size: Size,
      acquire: () => Unit,
      addAccessibleEventListener: XAccessibleEventListener => Unit,
      containsPoint: Point => Boolean,
      getAccessibleAtPoint: Point => XAccessible,
      getAccessibleChild: Double => XAccessible,
      getAccessibleChildCount: () => Double,
      getAccessibleContext: () => XAccessibleContext,
      getAccessibleDescription: () => String,
      getAccessibleIndexInParent: () => Double,
      getAccessibleName: () => String,
      getAccessibleParent: () => XAccessible,
      getAccessibleRelationSet: () => XAccessibleRelationSet,
      getAccessibleRole: () => Double,
      getAccessibleStateSet: () => XAccessibleStateSet,
      getBackground: () => Color,
      getBounds: () => Rectangle,
      getForeground: () => Color,
      getLocale: () => Locale,
      getLocation: () => Point,
      getLocationOnScreen: () => Point,
      getSize: () => Size,
      grabFocus: () => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeAccessibleEventListener: XAccessibleEventListener => Unit
    ): AccessibleFormulaText = {
      val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleContext = AccessibleContext.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), containsPoint = js.Any.fromFunction1(containsPoint), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getForeground = js.Any.fromFunction0(getForeground), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSize = js.Any.fromFunction0(getSize), grabFocus = js.Any.fromFunction0(grabFocus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener))
      __obj.asInstanceOf[AccessibleFormulaText]
    }
  }
  
  /**
    * The accessible view of a formula documents visual representation.
    * @since OOo 1.1.2
    */
  trait AccessibleFormulaView
    extends StObject
       with XAccessible
       with XAccessibleComponent
       with XAccessibleContext
       with XAccessibleText
       with XAccessibleEventBroadcaster
  object AccessibleFormulaView {
    
    @scala.inline
    def apply(
      AccessibleChildCount: Double,
      AccessibleContext: XAccessibleContext,
      AccessibleDescription: String,
      AccessibleIndexInParent: Double,
      AccessibleName: String,
      AccessibleParent: XAccessible,
      AccessibleRelationSet: XAccessibleRelationSet,
      AccessibleRole: Double,
      AccessibleStateSet: XAccessibleStateSet,
      Background: Color,
      Bounds: Rectangle,
      CaretPosition: Double,
      CharacterCount: Double,
      Foreground: Color,
      Locale: Locale,
      Location: Point,
      LocationOnScreen: Point,
      SelectedText: String,
      SelectionEnd: Double,
      SelectionStart: Double,
      Size: Size,
      Text: String,
      acquire: () => Unit,
      addAccessibleEventListener: XAccessibleEventListener => Unit,
      containsPoint: Point => Boolean,
      copyText: (Double, Double) => Boolean,
      getAccessibleAtPoint: Point => XAccessible,
      getAccessibleChild: Double => XAccessible,
      getAccessibleChildCount: () => Double,
      getAccessibleContext: () => XAccessibleContext,
      getAccessibleDescription: () => String,
      getAccessibleIndexInParent: () => Double,
      getAccessibleName: () => String,
      getAccessibleParent: () => XAccessible,
      getAccessibleRelationSet: () => XAccessibleRelationSet,
      getAccessibleRole: () => Double,
      getAccessibleStateSet: () => XAccessibleStateSet,
      getBackground: () => Color,
      getBounds: () => Rectangle,
      getCaretPosition: () => Double,
      getCharacter: Double => String,
      getCharacterAttributes: (Double, SeqEquiv[String]) => SafeArray[PropertyValue],
      getCharacterBounds: Double => Rectangle,
      getCharacterCount: () => Double,
      getForeground: () => Color,
      getIndexAtPoint: Point => Double,
      getLocale: () => Locale,
      getLocation: () => Point,
      getLocationOnScreen: () => Point,
      getSelectedText: () => String,
      getSelectionEnd: () => Double,
      getSelectionStart: () => Double,
      getSize: () => Size,
      getText: () => String,
      getTextAtIndex: (Double, Double) => TextSegment,
      getTextBeforeIndex: (Double, Double) => TextSegment,
      getTextBehindIndex: (Double, Double) => TextSegment,
      getTextRange: (Double, Double) => String,
      grabFocus: () => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeAccessibleEventListener: XAccessibleEventListener => Unit,
      setCaretPosition: Double => Boolean,
      setSelection: (Double, Double) => Boolean
    ): AccessibleFormulaView = {
      val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleContext = AccessibleContext.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], CaretPosition = CaretPosition.asInstanceOf[js.Any], CharacterCount = CharacterCount.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], SelectionEnd = SelectionEnd.asInstanceOf[js.Any], SelectionStart = SelectionStart.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), containsPoint = js.Any.fromFunction1(containsPoint), copyText = js.Any.fromFunction2(copyText), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getForeground = js.Any.fromFunction0(getForeground), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getSize = js.Any.fromFunction0(getSize), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), grabFocus = js.Any.fromFunction0(grabFocus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection))
      __obj.asInstanceOf[AccessibleFormulaView]
    }
  }
  
  /** The formula properties provide access to the properties of a formula in a formula generator */
  trait FormulaProperties extends StObject {
    
    /**
      * contains the alignment of the formula.
      * @see HorizontalAlignment
      */
    var Alignment: Double
    
    /**
      * contains the base font height in point the formula will be formatted in.
      *
      * All properties containing relative values are related to this value.
      */
    var BaseFontHeight: Double
    
    /**
      * contains the baselines offset in respect to the top of the formula rectangle
      * @since OOo 3.4
      */
    var BaseLine: Double
    
    /** contains the metric value of the bottom margin of the formula. */
    var BottomMargin: Double
    
    /** customized name for fixed font. */
    var CustomFontNameFixed: String
    
    /** customized name for sans serif font */
    var CustomFontNameSans: String
    
    /** customized name for serif font */
    var CustomFontNameSerif: String
    
    /** determines if the customized fixed font is bold. */
    var FontFixedIsBold: Boolean
    
    /** determines if the customized fixed font is italic. */
    var FontFixedIsItalic: Boolean
    
    /** determines if the font that is used to display functions is bold. */
    var FontFunctionsIsBold: Boolean
    
    /** determines if the font that is used to display functions is italic. */
    var FontFunctionsIsItalic: Boolean
    
    /** contains the name of the font that is used to display functions contained in the formula. */
    var FontNameFunctions: String
    
    /** contains the name of the font that is used to display numbers contained in the formula. */
    var FontNameNumbers: String
    
    /** contains the name of the font that is used to display text contained in the formula. */
    var FontNameText: String
    
    /** contains the name of the font that is used to display variables contained in the formula. */
    var FontNameVariables: String
    
    /** determines if the font that is used to display numbers is bold. */
    var FontNumbersIsBold: Boolean
    
    /** determines if the font that is used to display numbers is italic. */
    var FontNumbersIsItalic: Boolean
    
    /** determines if the customized sans serif font is bold. */
    var FontSansIsBold: Boolean
    
    /** determines if the customized sans serif font is italic. */
    var FontSansIsItalic: Boolean
    
    /** determines if the customized serif font is bold. */
    var FontSerifIsBold: Boolean
    
    /** determines if the customized serif font is italic. */
    var FontSerifIsItalic: Boolean
    
    /** determines if the font that is used to display text is bold. */
    var FontTextIsBold: Boolean
    
    /** determines if the font that is used to display text is italic. */
    var FontTextIsItalic: Boolean
    
    /** determines if the font that is used to display variables is bold. */
    var FontVariablesIsBold: Boolean
    
    /** determines if the font that is used to display variables is italic. */
    var FontVariablesIsItalic: Boolean
    
    /** contains the command string of the formula */
    var Formula: String
    
    /** decides if all brackets (even those without "left"/"right" modifier) are scaled. */
    var IsScaleAllBrackets: Boolean
    
    /** switches into text mode. */
    var IsTextMode: Boolean
    
    /** contains the metric value of the left margin of the formula. */
    var LeftMargin: Double
    
    /** contains the relative distance of brackets. */
    var RelativeBracketDistance: Double
    
    /** contains the relative excess size of brackets. */
    var RelativeBracketExcessSize: Double
    
    /**
      * contains the relative height of the font for functions.
      *
      * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
      */
    var RelativeFontHeightFunctions: Double
    
    /**
      * contains the relative height of the font for indices.
      *
      * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
      */
    var RelativeFontHeightIndices: Double
    
    /**
      * contains the relative height of the font for limits.
      *
      * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
      */
    var RelativeFontHeightLimits: Double
    
    /**
      * contains the relative height of the font for operators.
      *
      * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
      */
    var RelativeFontHeightOperators: Double
    
    /**
      * contains the relative height of the font for text.
      *
      * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
      */
    var RelativeFontHeightText: Double
    
    /** contains the relative excess length of a fraction bar. */
    var RelativeFractionBarExcessLength: Double
    
    /** contains the relative line weight of a fraction bar. */
    var RelativeFractionBarLineWeight: Double
    
    /** contains the relative depth of the denominator of a fraction */
    var RelativeFractionDenominatorDepth: Double
    
    /** contains the relative height of the numerator of a fraction. */
    var RelativeFractionNumeratorHeight: Double
    
    /** contains the relative superscript of indices. */
    var RelativeIndexSubscript: Double
    
    /** contains the relative subscript of indices. */
    var RelativeIndexSuperscript: Double
    
    /** contains the relative line spacing. */
    var RelativeLineSpacing: Double
    
    /** contains the relative distance of lower limits. */
    var RelativeLowerLimitDistance: Double
    
    /** contains the relative column spacing of matrices. */
    var RelativeMatrixColumnSpacing: Double
    
    /** contains the relative line spacing of matrices. */
    var RelativeMatrixLineSpacing: Double
    
    /** contains the relative excess of operators. */
    var RelativeOperatorExcessSize: Double
    
    /** contains the relative spacing of operators. */
    var RelativeOperatorSpacing: Double
    
    /** contains the relative root spacing */
    var RelativeRootSpacing: Double
    
    /** contains the relative scaling of the bracket excess. */
    var RelativeScaleBracketExcessSize: Double
    
    /** contains the relative spacing. */
    var RelativeSpacing: Double
    
    /** contains the relative minimum height of the formula. */
    var RelativeSymbolMinimumHeight: Double
    
    /** contains the relative primary height of symbols. */
    var RelativeSymbolPrimaryHeight: Double
    
    /** contains the relative distance of upper limits */
    var RelativeUpperLimitDistance: Double
    
    /** contains the metric value of the right margin of the formula. */
    var RightMargin: Double
    
    /** contains the metric value of the top margin of the formula. */
    var TopMargin: Double
  }
  object FormulaProperties {
    
    @scala.inline
    def apply(
      Alignment: Double,
      BaseFontHeight: Double,
      BaseLine: Double,
      BottomMargin: Double,
      CustomFontNameFixed: String,
      CustomFontNameSans: String,
      CustomFontNameSerif: String,
      FontFixedIsBold: Boolean,
      FontFixedIsItalic: Boolean,
      FontFunctionsIsBold: Boolean,
      FontFunctionsIsItalic: Boolean,
      FontNameFunctions: String,
      FontNameNumbers: String,
      FontNameText: String,
      FontNameVariables: String,
      FontNumbersIsBold: Boolean,
      FontNumbersIsItalic: Boolean,
      FontSansIsBold: Boolean,
      FontSansIsItalic: Boolean,
      FontSerifIsBold: Boolean,
      FontSerifIsItalic: Boolean,
      FontTextIsBold: Boolean,
      FontTextIsItalic: Boolean,
      FontVariablesIsBold: Boolean,
      FontVariablesIsItalic: Boolean,
      Formula: String,
      IsScaleAllBrackets: Boolean,
      IsTextMode: Boolean,
      LeftMargin: Double,
      RelativeBracketDistance: Double,
      RelativeBracketExcessSize: Double,
      RelativeFontHeightFunctions: Double,
      RelativeFontHeightIndices: Double,
      RelativeFontHeightLimits: Double,
      RelativeFontHeightOperators: Double,
      RelativeFontHeightText: Double,
      RelativeFractionBarExcessLength: Double,
      RelativeFractionBarLineWeight: Double,
      RelativeFractionDenominatorDepth: Double,
      RelativeFractionNumeratorHeight: Double,
      RelativeIndexSubscript: Double,
      RelativeIndexSuperscript: Double,
      RelativeLineSpacing: Double,
      RelativeLowerLimitDistance: Double,
      RelativeMatrixColumnSpacing: Double,
      RelativeMatrixLineSpacing: Double,
      RelativeOperatorExcessSize: Double,
      RelativeOperatorSpacing: Double,
      RelativeRootSpacing: Double,
      RelativeScaleBracketExcessSize: Double,
      RelativeSpacing: Double,
      RelativeSymbolMinimumHeight: Double,
      RelativeSymbolPrimaryHeight: Double,
      RelativeUpperLimitDistance: Double,
      RightMargin: Double,
      TopMargin: Double
    ): FormulaProperties = {
      val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], BaseFontHeight = BaseFontHeight.asInstanceOf[js.Any], BaseLine = BaseLine.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], CustomFontNameFixed = CustomFontNameFixed.asInstanceOf[js.Any], CustomFontNameSans = CustomFontNameSans.asInstanceOf[js.Any], CustomFontNameSerif = CustomFontNameSerif.asInstanceOf[js.Any], FontFixedIsBold = FontFixedIsBold.asInstanceOf[js.Any], FontFixedIsItalic = FontFixedIsItalic.asInstanceOf[js.Any], FontFunctionsIsBold = FontFunctionsIsBold.asInstanceOf[js.Any], FontFunctionsIsItalic = FontFunctionsIsItalic.asInstanceOf[js.Any], FontNameFunctions = FontNameFunctions.asInstanceOf[js.Any], FontNameNumbers = FontNameNumbers.asInstanceOf[js.Any], FontNameText = FontNameText.asInstanceOf[js.Any], FontNameVariables = FontNameVariables.asInstanceOf[js.Any], FontNumbersIsBold = FontNumbersIsBold.asInstanceOf[js.Any], FontNumbersIsItalic = FontNumbersIsItalic.asInstanceOf[js.Any], FontSansIsBold = FontSansIsBold.asInstanceOf[js.Any], FontSansIsItalic = FontSansIsItalic.asInstanceOf[js.Any], FontSerifIsBold = FontSerifIsBold.asInstanceOf[js.Any], FontSerifIsItalic = FontSerifIsItalic.asInstanceOf[js.Any], FontTextIsBold = FontTextIsBold.asInstanceOf[js.Any], FontTextIsItalic = FontTextIsItalic.asInstanceOf[js.Any], FontVariablesIsBold = FontVariablesIsBold.asInstanceOf[js.Any], FontVariablesIsItalic = FontVariablesIsItalic.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], IsScaleAllBrackets = IsScaleAllBrackets.asInstanceOf[js.Any], IsTextMode = IsTextMode.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], RelativeBracketDistance = RelativeBracketDistance.asInstanceOf[js.Any], RelativeBracketExcessSize = RelativeBracketExcessSize.asInstanceOf[js.Any], RelativeFontHeightFunctions = RelativeFontHeightFunctions.asInstanceOf[js.Any], RelativeFontHeightIndices = RelativeFontHeightIndices.asInstanceOf[js.Any], RelativeFontHeightLimits = RelativeFontHeightLimits.asInstanceOf[js.Any], RelativeFontHeightOperators = RelativeFontHeightOperators.asInstanceOf[js.Any], RelativeFontHeightText = RelativeFontHeightText.asInstanceOf[js.Any], RelativeFractionBarExcessLength = RelativeFractionBarExcessLength.asInstanceOf[js.Any], RelativeFractionBarLineWeight = RelativeFractionBarLineWeight.asInstanceOf[js.Any], RelativeFractionDenominatorDepth = RelativeFractionDenominatorDepth.asInstanceOf[js.Any], RelativeFractionNumeratorHeight = RelativeFractionNumeratorHeight.asInstanceOf[js.Any], RelativeIndexSubscript = RelativeIndexSubscript.asInstanceOf[js.Any], RelativeIndexSuperscript = RelativeIndexSuperscript.asInstanceOf[js.Any], RelativeLineSpacing = RelativeLineSpacing.asInstanceOf[js.Any], RelativeLowerLimitDistance = RelativeLowerLimitDistance.asInstanceOf[js.Any], RelativeMatrixColumnSpacing = RelativeMatrixColumnSpacing.asInstanceOf[js.Any], RelativeMatrixLineSpacing = RelativeMatrixLineSpacing.asInstanceOf[js.Any], RelativeOperatorExcessSize = RelativeOperatorExcessSize.asInstanceOf[js.Any], RelativeOperatorSpacing = RelativeOperatorSpacing.asInstanceOf[js.Any], RelativeRootSpacing = RelativeRootSpacing.asInstanceOf[js.Any], RelativeScaleBracketExcessSize = RelativeScaleBracketExcessSize.asInstanceOf[js.Any], RelativeSpacing = RelativeSpacing.asInstanceOf[js.Any], RelativeSymbolMinimumHeight = RelativeSymbolMinimumHeight.asInstanceOf[js.Any], RelativeSymbolPrimaryHeight = RelativeSymbolPrimaryHeight.asInstanceOf[js.Any], RelativeUpperLimitDistance = RelativeUpperLimitDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormulaProperties]
    }
    
    @scala.inline
    implicit class FormulaPropertiesMutableBuilder[Self <: FormulaProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: Double): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseFontHeight(value: Double): Self = StObject.set(x, "BaseFontHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseLine(value: Double): Self = StObject.set(x, "BaseLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomMargin(value: Double): Self = StObject.set(x, "BottomMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFontNameFixed(value: String): Self = StObject.set(x, "CustomFontNameFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFontNameSans(value: String): Self = StObject.set(x, "CustomFontNameSans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFontNameSerif(value: String): Self = StObject.set(x, "CustomFontNameSerif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFixedIsBold(value: Boolean): Self = StObject.set(x, "FontFixedIsBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFixedIsItalic(value: Boolean): Self = StObject.set(x, "FontFixedIsItalic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFunctionsIsBold(value: Boolean): Self = StObject.set(x, "FontFunctionsIsBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFunctionsIsItalic(value: Boolean): Self = StObject.set(x, "FontFunctionsIsItalic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNameFunctions(value: String): Self = StObject.set(x, "FontNameFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNameNumbers(value: String): Self = StObject.set(x, "FontNameNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNameText(value: String): Self = StObject.set(x, "FontNameText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNameVariables(value: String): Self = StObject.set(x, "FontNameVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNumbersIsBold(value: Boolean): Self = StObject.set(x, "FontNumbersIsBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNumbersIsItalic(value: Boolean): Self = StObject.set(x, "FontNumbersIsItalic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSansIsBold(value: Boolean): Self = StObject.set(x, "FontSansIsBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSansIsItalic(value: Boolean): Self = StObject.set(x, "FontSansIsItalic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSerifIsBold(value: Boolean): Self = StObject.set(x, "FontSerifIsBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSerifIsItalic(value: Boolean): Self = StObject.set(x, "FontSerifIsItalic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontTextIsBold(value: Boolean): Self = StObject.set(x, "FontTextIsBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontTextIsItalic(value: Boolean): Self = StObject.set(x, "FontTextIsItalic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariablesIsBold(value: Boolean): Self = StObject.set(x, "FontVariablesIsBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariablesIsItalic(value: Boolean): Self = StObject.set(x, "FontVariablesIsItalic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScaleAllBrackets(value: Boolean): Self = StObject.set(x, "IsScaleAllBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTextMode(value: Boolean): Self = StObject.set(x, "IsTextMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeBracketDistance(value: Double): Self = StObject.set(x, "RelativeBracketDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeBracketExcessSize(value: Double): Self = StObject.set(x, "RelativeBracketExcessSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFontHeightFunctions(value: Double): Self = StObject.set(x, "RelativeFontHeightFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFontHeightIndices(value: Double): Self = StObject.set(x, "RelativeFontHeightIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFontHeightLimits(value: Double): Self = StObject.set(x, "RelativeFontHeightLimits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFontHeightOperators(value: Double): Self = StObject.set(x, "RelativeFontHeightOperators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFontHeightText(value: Double): Self = StObject.set(x, "RelativeFontHeightText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFractionBarExcessLength(value: Double): Self = StObject.set(x, "RelativeFractionBarExcessLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFractionBarLineWeight(value: Double): Self = StObject.set(x, "RelativeFractionBarLineWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFractionDenominatorDepth(value: Double): Self = StObject.set(x, "RelativeFractionDenominatorDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFractionNumeratorHeight(value: Double): Self = StObject.set(x, "RelativeFractionNumeratorHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeIndexSubscript(value: Double): Self = StObject.set(x, "RelativeIndexSubscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeIndexSuperscript(value: Double): Self = StObject.set(x, "RelativeIndexSuperscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeLineSpacing(value: Double): Self = StObject.set(x, "RelativeLineSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeLowerLimitDistance(value: Double): Self = StObject.set(x, "RelativeLowerLimitDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeMatrixColumnSpacing(value: Double): Self = StObject.set(x, "RelativeMatrixColumnSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeMatrixLineSpacing(value: Double): Self = StObject.set(x, "RelativeMatrixLineSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeOperatorExcessSize(value: Double): Self = StObject.set(x, "RelativeOperatorExcessSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeOperatorSpacing(value: Double): Self = StObject.set(x, "RelativeOperatorSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeRootSpacing(value: Double): Self = StObject.set(x, "RelativeRootSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeScaleBracketExcessSize(value: Double): Self = StObject.set(x, "RelativeScaleBracketExcessSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeSpacing(value: Double): Self = StObject.set(x, "RelativeSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeSymbolMinimumHeight(value: Double): Self = StObject.set(x, "RelativeSymbolMinimumHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeSymbolPrimaryHeight(value: Double): Self = StObject.set(x, "RelativeSymbolPrimaryHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUpperLimitDistance(value: Double): Self = StObject.set(x, "RelativeUpperLimitDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightMargin(value: Double): Self = StObject.set(x, "RightMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopMargin(value: Double): Self = StObject.set(x, "TopMargin", value.asInstanceOf[js.Any])
    }
  }
  
  /** @deprecated DeprecateddraftnWeight should be changed to float as in FontWeight.idlnItalic probably needs to have FontItalic extended by the two extra defines */
  trait SymbolDescriptor extends StObject {
    
    /**
      * Specifies the character set which is supported by the font.
      * @see com.sun.star.awt.CharSet
      */
    var nCharSet: Double
    
    /** Specifies the Unicode character of the symbol. */
    var nCharacter: Double
    
    /**
      * Specifies the general style of the font.
      * @see com.sun.star.awt.FontFamily
      */
    var nFamily: Double
    
    /**
      * Specifies if the font is italic.
      * @see com.sun.star.awt.FontSlant The values com::sun::star::awt::FontSlant::REVERSE_OBLIQUE and com::sun::star::awt::FontSlant::REVERSE_ITALIC may not
      */
    var nItalic: Double
    
    /**
      * Specifies the pitch of the font.
      * @see com.sun.star.awt.FontPitch
      */
    var nPitch: Double
    
    /**
      * Specifies the thickness of the line.
      * @see com.sun.star.awt.FontWeight The allowed integer values correspond as follows: 0 : {@link com.sun.star.awt.FontWeight.DONTKNOW} 1 : {@link com.sun
      */
    var nWeight: Double
    
    /** The export name of the symbol. */
    var sExportName: String
    
    /** Specifies the exact name of the font ("Arial", "Courier", etc.). */
    var sFontName: String
    
    /** The name of the symbol. */
    var sName: String
    
    /** Specifies the name of the symbol set to which this symbol belongs. */
    var sSymbolSet: String
  }
  object SymbolDescriptor {
    
    @scala.inline
    def apply(
      nCharSet: Double,
      nCharacter: Double,
      nFamily: Double,
      nItalic: Double,
      nPitch: Double,
      nWeight: Double,
      sExportName: String,
      sFontName: String,
      sName: String,
      sSymbolSet: String
    ): SymbolDescriptor = {
      val __obj = js.Dynamic.literal(nCharSet = nCharSet.asInstanceOf[js.Any], nCharacter = nCharacter.asInstanceOf[js.Any], nFamily = nFamily.asInstanceOf[js.Any], nItalic = nItalic.asInstanceOf[js.Any], nPitch = nPitch.asInstanceOf[js.Any], nWeight = nWeight.asInstanceOf[js.Any], sExportName = sExportName.asInstanceOf[js.Any], sFontName = sFontName.asInstanceOf[js.Any], sName = sName.asInstanceOf[js.Any], sSymbolSet = sSymbolSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymbolDescriptor]
    }
    
    @scala.inline
    implicit class SymbolDescriptorMutableBuilder[Self <: SymbolDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNCharSet(value: Double): Self = StObject.set(x, "nCharSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNCharacter(value: Double): Self = StObject.set(x, "nCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNFamily(value: Double): Self = StObject.set(x, "nFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNItalic(value: Double): Self = StObject.set(x, "nItalic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNPitch(value: Double): Self = StObject.set(x, "nPitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNWeight(value: Double): Self = StObject.set(x, "nWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSExportName(value: String): Self = StObject.set(x, "sExportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSFontName(value: String): Self = StObject.set(x, "sFontName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSName(value: String): Self = StObject.set(x, "sName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSymbolSet(value: String): Self = StObject.set(x, "sSymbolSet", value.asInstanceOf[js.Any])
    }
  }
}
