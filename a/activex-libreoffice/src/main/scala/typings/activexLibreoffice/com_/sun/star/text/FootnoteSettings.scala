package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the settings of footnotes or endnotes in a (text) document. */
@js.native
trait FootnoteSettings extends js.Object {
  
  /**
    * contains the name of the character style that is used for footnote/endnote anchor in the text.
    * @since OOo 2.0
    */
  var AnchorCharStyleName: String = js.native
  
  /**
    * contains the string at the restart of the footnote text after a break.
    *
    * For footnotes only.
    */
  var BeginNotice: String = js.native
  
  /** contains the name of the character style that is used for the label in front of the footnote/endnote text. */
  var CharStyleName: String = js.native
  
  /**
    * contains the string at the end of a footnote part in front of a break.
    *
    * For footnotes only.
    */
  var EndNotice: String = js.native
  
  /**
    * contains the type of the counting of the footnote numbers.
    *
    * For footnotes only.
    * @see FootnoteNumbering
    */
  var FootnoteCounting: Double = js.native
  
  /** contains the numbering type for the numbering of the footnotes/endnotes. */
  var NumberingType: Double = js.native
  
  /** contains the page style that is used for the page that contains the footnote/endnote texts */
  var PageStyleName: String = js.native
  
  /** contains the paragraph style that is used for the footnote/endnote text. */
  var ParaStyleName: String = js.native
  
  /**
    * If `TRUE` , the footnote text is shown at the end of the document.
    *
    * For footnotes only.
    */
  var PositionEndOfDoc: Boolean = js.native
  
  /** contains the prefix for the footnote/endnote symbol. */
  var Prefix: String = js.native
  
  /** contains the first number of the automatic numbering of footnotes/endnotes. */
  var StartAt: Double = js.native
  
  /** contains the suffix for the footnote/endnote symbol. */
  var Suffix: String = js.native
}
object FootnoteSettings {
  
  @scala.inline
  def apply(
    AnchorCharStyleName: String,
    BeginNotice: String,
    CharStyleName: String,
    EndNotice: String,
    FootnoteCounting: Double,
    NumberingType: Double,
    PageStyleName: String,
    ParaStyleName: String,
    PositionEndOfDoc: Boolean,
    Prefix: String,
    StartAt: Double,
    Suffix: String
  ): FootnoteSettings = {
    val __obj = js.Dynamic.literal(AnchorCharStyleName = AnchorCharStyleName.asInstanceOf[js.Any], BeginNotice = BeginNotice.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], EndNotice = EndNotice.asInstanceOf[js.Any], FootnoteCounting = FootnoteCounting.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], PositionEndOfDoc = PositionEndOfDoc.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], StartAt = StartAt.asInstanceOf[js.Any], Suffix = Suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteSettings]
  }
  
  @scala.inline
  implicit class FootnoteSettingsOps[Self <: FootnoteSettings] (val x: Self) extends AnyVal {
    
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
    def setAnchorCharStyleName(value: String): Self = this.set("AnchorCharStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginNotice(value: String): Self = this.set("BeginNotice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharStyleName(value: String): Self = this.set("CharStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndNotice(value: String): Self = this.set("EndNotice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteCounting(value: Double): Self = this.set("FootnoteCounting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingType(value: Double): Self = this.set("NumberingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStyleName(value: String): Self = this.set("PageStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleName(value: String): Self = this.set("ParaStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionEndOfDoc(value: Boolean): Self = this.set("PositionEndOfDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAt(value: Double): Self = this.set("StartAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("Suffix", value.asInstanceOf[js.Any])
  }
}
