package typings.activexDashLibreoffice.comNs.sunNs.starNs.formulaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated DeprecateddraftnWeight should be changed to float as in FontWeight.idlnItalic probably needs to have FontItalic extended by the two extra defines */
trait SymbolDescriptor extends js.Object {
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
    val __obj = js.Dynamic.literal(nCharSet = nCharSet, nCharacter = nCharacter, nFamily = nFamily, nItalic = nItalic, nPitch = nPitch, nWeight = nWeight, sExportName = sExportName, sFontName = sFontName, sName = sName, sSymbolSet = sSymbolSet)
  
    __obj.asInstanceOf[SymbolDescriptor]
  }
}

