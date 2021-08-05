package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingBlockTypes extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: WdBuildingBlockTypes): BuildingBlockType
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.BuildingBlockTypes_typekey")
  var WordDotBuildingBlockTypes_typekey: BuildingBlockTypes
}
object BuildingBlockTypes {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdBuildingBlockTypes => BuildingBlockType,
    Parent: js.Any,
    WordDotBuildingBlockTypes_typekey: BuildingBlockTypes
  ): BuildingBlockTypes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.BuildingBlockTypes_typekey")(WordDotBuildingBlockTypes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingBlockTypes]
  }
  
  extension [Self <: BuildingBlockTypes](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: WdBuildingBlockTypes => BuildingBlockType): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotBuildingBlockTypes_typekey(value: BuildingBlockTypes): Self = StObject.set(x, "Word.BuildingBlockTypes_typekey", value.asInstanceOf[js.Any])
  }
}
