package typings.activexLibreoffice.com_.sun.star.formula

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated DeprecateddraftnWeight should be changed to float as in FontWeight.idlnItalic probably needs to have FontItalic extended by the two extra defines */
@js.native
trait SymbolDescriptor extends js.Object {
  
  /**
    * Specifies the character set which is supported by the font.
    * @see com.sun.star.awt.CharSet
    */
  var nCharSet: Double = js.native
  
  /** Specifies the Unicode character of the symbol. */
  var nCharacter: Double = js.native
  
  /**
    * Specifies the general style of the font.
    * @see com.sun.star.awt.FontFamily
    */
  var nFamily: Double = js.native
  
  /**
    * Specifies if the font is italic.
    * @see com.sun.star.awt.FontSlant The values com::sun::star::awt::FontSlant::REVERSE_OBLIQUE and com::sun::star::awt::FontSlant::REVERSE_ITALIC may not
    */
  var nItalic: Double = js.native
  
  /**
    * Specifies the pitch of the font.
    * @see com.sun.star.awt.FontPitch
    */
  var nPitch: Double = js.native
  
  /**
    * Specifies the thickness of the line.
    * @see com.sun.star.awt.FontWeight The allowed integer values correspond as follows: 0 : {@link com.sun.star.awt.FontWeight.DONTKNOW} 1 : {@link com.sun
    */
  var nWeight: Double = js.native
  
  /** The export name of the symbol. */
  var sExportName: String = js.native
  
  /** Specifies the exact name of the font ("Arial", "Courier", etc.). */
  var sFontName: String = js.native
  
  /** The name of the symbol. */
  var sName: String = js.native
  
  /** Specifies the name of the symbol set to which this symbol belongs. */
  var sSymbolSet: String = js.native
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
  implicit class SymbolDescriptorOps[Self <: SymbolDescriptor] (val x: Self) extends AnyVal {
    
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
    def setNCharSet(value: Double): Self = this.set("nCharSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNCharacter(value: Double): Self = this.set("nCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNFamily(value: Double): Self = this.set("nFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNItalic(value: Double): Self = this.set("nItalic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNPitch(value: Double): Self = this.set("nPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNWeight(value: Double): Self = this.set("nWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSExportName(value: String): Self = this.set("sExportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSFontName(value: String): Self = this.set("sFontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSName(value: String): Self = this.set("sName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSymbolSet(value: String): Self = this.set("sSymbolSet", value.asInstanceOf[js.Any])
  }
}
