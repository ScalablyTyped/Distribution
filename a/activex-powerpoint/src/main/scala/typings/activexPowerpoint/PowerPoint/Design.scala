package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Design extends StObject {
  
  def AddTitleMaster(): Master
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  def Delete(): Unit
  
  val HasTitleMaster: MsoTriState
  
  val Index: Double
  
  def MoveTo(toPos: Double): Unit
  
  var Name: String
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.Design_typekey")
  var PowerPointDotDesign_typekey: Design
  
  var Preserved: MsoTriState
  
  val SlideMaster: Master
  
  val TitleMaster: Master
}
object Design {
  
  inline def apply(
    AddTitleMaster: () => Master,
    Application: Application,
    Delete: () => Unit,
    HasTitleMaster: MsoTriState,
    Index: Double,
    MoveTo: Double => Unit,
    Name: String,
    Parent: js.Any,
    PowerPointDotDesign_typekey: Design,
    Preserved: MsoTriState,
    SlideMaster: Master,
    TitleMaster: Master
  ): Design = {
    val __obj = js.Dynamic.literal(AddTitleMaster = js.Any.fromFunction0(AddTitleMaster), Application = Application.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), HasTitleMaster = HasTitleMaster.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MoveTo = js.Any.fromFunction1(MoveTo), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Preserved = Preserved.asInstanceOf[js.Any], SlideMaster = SlideMaster.asInstanceOf[js.Any], TitleMaster = TitleMaster.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Design_typekey")(PowerPointDotDesign_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Design]
  }
  
  extension [Self <: Design](x: Self) {
    
    inline def setAddTitleMaster(value: () => Master): Self = StObject.set(x, "AddTitleMaster", js.Any.fromFunction0(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setHasTitleMaster(value: MsoTriState): Self = StObject.set(x, "HasTitleMaster", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMoveTo(value: Double => Unit): Self = StObject.set(x, "MoveTo", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotDesign_typekey(value: Design): Self = StObject.set(x, "PowerPoint.Design_typekey", value.asInstanceOf[js.Any])
    
    inline def setPreserved(value: MsoTriState): Self = StObject.set(x, "Preserved", value.asInstanceOf[js.Any])
    
    inline def setSlideMaster(value: Master): Self = StObject.set(x, "SlideMaster", value.asInstanceOf[js.Any])
    
    inline def setTitleMaster(value: Master): Self = StObject.set(x, "TitleMaster", value.asInstanceOf[js.Any])
  }
}
