package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapFormat extends StObject {
  
  var AllowOverlap: Double = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  var DistanceBottom: Double = js.native
  
  var DistanceLeft: Double = js.native
  
  var DistanceRight: Double = js.native
  
  var DistanceTop: Double = js.native
  
  val Parent: js.Any = js.native
  
  var Side: WdWrapSideType = js.native
  
  var Type: WdWrapType = js.native
  
  @JSName("Word.WrapFormat_typekey")
  var WordDotWrapFormat_typekey: WrapFormat = js.native
}
object WrapFormat {
  
  @scala.inline
  def apply(
    AllowOverlap: Double,
    Application: Application,
    Creator: Double,
    DistanceBottom: Double,
    DistanceLeft: Double,
    DistanceRight: Double,
    DistanceTop: Double,
    Parent: js.Any,
    Side: WdWrapSideType,
    Type: WdWrapType,
    WordDotWrapFormat_typekey: WrapFormat
  ): WrapFormat = {
    val __obj = js.Dynamic.literal(AllowOverlap = AllowOverlap.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DistanceBottom = DistanceBottom.asInstanceOf[js.Any], DistanceLeft = DistanceLeft.asInstanceOf[js.Any], DistanceRight = DistanceRight.asInstanceOf[js.Any], DistanceTop = DistanceTop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Side = Side.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.WrapFormat_typekey")(WordDotWrapFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapFormat]
  }
  
  @scala.inline
  implicit class WrapFormatMutableBuilder[Self <: WrapFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowOverlap(value: Double): Self = StObject.set(x, "AllowOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceBottom(value: Double): Self = StObject.set(x, "DistanceBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceLeft(value: Double): Self = StObject.set(x, "DistanceLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceRight(value: Double): Self = StObject.set(x, "DistanceRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceTop(value: Double): Self = StObject.set(x, "DistanceTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSide(value: WdWrapSideType): Self = StObject.set(x, "Side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdWrapType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotWrapFormat_typekey(value: WrapFormat): Self = StObject.set(x, "Word.WrapFormat_typekey", value.asInstanceOf[js.Any])
  }
}
