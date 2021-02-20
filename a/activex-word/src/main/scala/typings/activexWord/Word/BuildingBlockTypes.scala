package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingBlockTypes extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: WdBuildingBlockTypes): BuildingBlockType = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.BuildingBlockTypes_typekey")
  var WordDotBuildingBlockTypes_typekey: BuildingBlockTypes = js.native
}
object BuildingBlockTypes {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class BuildingBlockTypesMutableBuilder[Self <: BuildingBlockTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: WdBuildingBlockTypes => BuildingBlockType): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotBuildingBlockTypes_typekey(value: BuildingBlockTypes): Self = StObject.set(x, "Word.BuildingBlockTypes_typekey", value.asInstanceOf[js.Any])
  }
}
