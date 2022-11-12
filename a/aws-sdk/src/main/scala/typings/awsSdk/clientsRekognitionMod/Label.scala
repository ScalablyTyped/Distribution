package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  /**
    * A list of potential aliases for a given label.
    */
  var Aliases: js.UndefOr[LabelAliases] = js.undefined
  
  /**
    * A list of the categories associated with a given label.
    */
  var Categories: js.UndefOr[LabelCategories] = js.undefined
  
  /**
    * Level of confidence.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * If Label represents an object, Instances contains the bounding boxes for each instance of the detected object. Bounding boxes are returned for common object labels such as people, cars, furniture, apparel or pets.
    */
  var Instances: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Instances] = js.undefined
  
  /**
    * The name (label) of the object or scene.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The parent labels for a label. The response includes all ancestor labels.
    */
  var Parents: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Parents] = js.undefined
}
object Label {
  
  inline def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setAliases(value: LabelAliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    inline def setAliasesVarargs(value: LabelAlias*): Self = StObject.set(x, "Aliases", js.Array(value*))
    
    inline def setCategories(value: LabelCategories): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "Categories", js.undefined)
    
    inline def setCategoriesVarargs(value: LabelCategory*): Self = StObject.set(x, "Categories", js.Array(value*))
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParents(value: Parents): Self = StObject.set(x, "Parents", value.asInstanceOf[js.Any])
    
    inline def setParentsUndefined: Self = StObject.set(x, "Parents", js.undefined)
    
    inline def setParentsVarargs(value: Parent*): Self = StObject.set(x, "Parents", js.Array(value*))
  }
}
