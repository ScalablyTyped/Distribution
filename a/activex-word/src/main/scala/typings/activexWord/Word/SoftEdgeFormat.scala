package typings.activexWord.Word

import typings.activexOffice.Office.MsoSoftEdgeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftEdgeFormat extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Parent: js.Any
  
  var Radius: Double
  
  var Type: MsoSoftEdgeType
  
  /* private */ @JSName("Word.SoftEdgeFormat_typekey")
  var WordDotSoftEdgeFormat_typekey: SoftEdgeFormat
}
object SoftEdgeFormat {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Radius: Double,
    Type: MsoSoftEdgeType,
    WordDotSoftEdgeFormat_typekey: SoftEdgeFormat
  ): SoftEdgeFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SoftEdgeFormat_typekey")(WordDotSoftEdgeFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftEdgeFormat]
  }
  
  extension [Self <: SoftEdgeFormat](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "Radius", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoSoftEdgeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotSoftEdgeFormat_typekey(value: SoftEdgeFormat): Self = StObject.set(x, "Word.SoftEdgeFormat_typekey", value.asInstanceOf[js.Any])
  }
}
