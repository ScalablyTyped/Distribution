package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingBlockType extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Categories: typings.activexWord.Word.Categories
  
  val Creator: Double
  
  val Index: Double
  
  val Name: String
  
  val Parent: Any
  
  /* private */ @JSName("Word.BuildingBlockType_typekey")
  var WordDotBuildingBlockType_typekey: BuildingBlockType
}
object BuildingBlockType {
  
  inline def apply(
    Application: Application,
    Categories: Categories,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: Any,
    WordDotBuildingBlockType_typekey: BuildingBlockType
  ): BuildingBlockType = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.BuildingBlockType_typekey")(WordDotBuildingBlockType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingBlockType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildingBlockType] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: Categories): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotBuildingBlockType_typekey(value: BuildingBlockType): Self = StObject.set(x, "Word.BuildingBlockType_typekey", value.asInstanceOf[js.Any])
  }
}
