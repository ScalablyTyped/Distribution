package typings.activexLibreoffice.com_.sun.star.style

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties describe the numbering of a paragraph.
  *
  * NumberType determines the type of the numbering symbol. Depending on this setting, some of the following values will be ignored.
  */
@js.native
trait NumberingLevel extends StObject {
  
  /** This is the name of the font that is used for the bullet. */
  var BulletFontName: String = js.native
  
  /** The bullet symbol with this code in the assigned font is used. */
  var BulletId: Double = js.native
  
  /** This is the name of the character style that is used for the symbol(s). */
  var CharStyleName: String = js.native
  
  /** This is the URL of a graphic file to use as a symbol. */
  var GraphicURL: String = js.native
  
  /**
    * specifies the type of numbering.
    * @see NumberingType
    */
  var NumberingType: Double = js.native
  
  /** specifies the number of higher numbering levels that are included in the representation of the current number. */
  var ParentNumbering: Double = js.native
  
  /** This prefix is inserted in front of the numbering symbol(s). */
  var Prefix: String = js.native
  
  /** This specifies the start value for the numbering. */
  var StartWith: Double = js.native
  
  /** This suffix is inserted after the numbering symbol(s). */
  var Suffix: String = js.native
}
object NumberingLevel {
  
  @scala.inline
  def apply(
    BulletFontName: String,
    BulletId: Double,
    CharStyleName: String,
    GraphicURL: String,
    NumberingType: Double,
    ParentNumbering: Double,
    Prefix: String,
    StartWith: Double,
    Suffix: String
  ): NumberingLevel = {
    val __obj = js.Dynamic.literal(BulletFontName = BulletFontName.asInstanceOf[js.Any], BulletId = BulletId.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], GraphicURL = GraphicURL.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], ParentNumbering = ParentNumbering.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], StartWith = StartWith.asInstanceOf[js.Any], Suffix = Suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberingLevel]
  }
  
  @scala.inline
  implicit class NumberingLevelMutableBuilder[Self <: NumberingLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulletFontName(value: String): Self = StObject.set(x, "BulletFontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletId(value: Double): Self = StObject.set(x, "BulletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharStyleName(value: String): Self = StObject.set(x, "CharStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicURL(value: String): Self = StObject.set(x, "GraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingType(value: Double): Self = StObject.set(x, "NumberingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNumbering(value: Double): Self = StObject.set(x, "ParentNumbering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWith(value: Double): Self = StObject.set(x, "StartWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "Suffix", value.asInstanceOf[js.Any])
  }
}
