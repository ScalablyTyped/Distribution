package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val BuildingBlocks: typings.activexWord.Word.BuildingBlocks = js.native
  
  val Creator: Double = js.native
  
  val Index: Double = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Type: BuildingBlockType = js.native
  
  @JSName("Word.Category_typekey")
  var WordDotCategory_typekey: Category = js.native
}
object Category {
  
  @scala.inline
  def apply(
    Application: Application,
    BuildingBlocks: BuildingBlocks,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    Type: BuildingBlockType,
    WordDotCategory_typekey: Category
  ): Category = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuildingBlocks = BuildingBlocks.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Category_typekey")(WordDotCategory_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildingBlocks(value: BuildingBlocks): Self = StObject.set(x, "BuildingBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: BuildingBlockType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCategory_typekey(value: Category): Self = StObject.set(x, "Word.Category_typekey", value.asInstanceOf[js.Any])
  }
}
