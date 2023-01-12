package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.apolloProtobufjs.mod.AnyNestedObject because Already inherited */ trait IType
  extends StObject
     with INamespace {
  
  /** Extension ranges */
  var extensions: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /** Field descriptors */
  var fields: StringDictionary[IField]
  
  /** Whether a legacy group or not */
  var group: js.UndefOr[Boolean] = js.undefined
  
  /** Oneof descriptors */
  var oneofs: js.UndefOr[StringDictionary[IOneOf]] = js.undefined
  
  /** Reserved ranges */
  var reserved: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
}
object IType {
  
  inline def apply(fields: StringDictionary[IField]): IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IType] (val x: Self) extends AnyVal {
    
    inline def setExtensions(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setFields(value: StringDictionary[IField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setOneofs(value: StringDictionary[IOneOf]): Self = StObject.set(x, "oneofs", value.asInstanceOf[js.Any])
    
    inline def setOneofsUndefined: Self = StObject.set(x, "oneofs", js.undefined)
    
    inline def setReserved(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    inline def setReservedVarargs(value: js.Array[Double]*): Self = StObject.set(x, "reserved", js.Array(value*))
  }
}
