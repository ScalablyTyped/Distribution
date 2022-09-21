package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentBindingPropertiesValueProperties extends StObject {
  
  /**
    * An Amazon S3 bucket.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The default value to assign to the property.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * The field to bind the data to.
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The storage key for an Amazon S3 bucket.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * An Amplify DataStore model.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * A list of predicates for binding a component's properties to data.
    */
  var predicates: js.UndefOr[PredicateList] = js.undefined
  
  /**
    * The name of a component slot.
    */
  var slotName: js.UndefOr[String] = js.undefined
  
  /**
    * An authenticated user attribute.
    */
  var userAttribute: js.UndefOr[String] = js.undefined
}
object ComponentBindingPropertiesValueProperties {
  
  inline def apply(): ComponentBindingPropertiesValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentBindingPropertiesValueProperties]
  }
  
  extension [Self <: ComponentBindingPropertiesValueProperties](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setPredicates(value: PredicateList): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
    
    inline def setPredicatesUndefined: Self = StObject.set(x, "predicates", js.undefined)
    
    inline def setPredicatesVarargs(value: Predicate*): Self = StObject.set(x, "predicates", js.Array(value*))
    
    inline def setSlotName(value: String): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
    
    inline def setSlotNameUndefined: Self = StObject.set(x, "slotName", js.undefined)
    
    inline def setUserAttribute(value: String): Self = StObject.set(x, "userAttribute", value.asInstanceOf[js.Any])
    
    inline def setUserAttributeUndefined: Self = StObject.set(x, "userAttribute", js.undefined)
  }
}
