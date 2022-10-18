package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyParameter extends StObject {
  
  /**
    *  Name of the parameter from the list of Review Polices. 
    */
  var Key: js.UndefOr[String] = js.undefined
  
  /**
    *  List of ParameterMapEntry objects. 
    */
  var MapEntries: js.UndefOr[ParameterMapEntryList] = js.undefined
  
  /**
    *  The list of values of the Parameter
    */
  var Values: js.UndefOr[StringList] = js.undefined
}
object PolicyParameter {
  
  inline def apply(): PolicyParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyParameter]
  }
  
  extension [Self <: PolicyParameter](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setMapEntries(value: ParameterMapEntryList): Self = StObject.set(x, "MapEntries", value.asInstanceOf[js.Any])
    
    inline def setMapEntriesUndefined: Self = StObject.set(x, "MapEntries", js.undefined)
    
    inline def setMapEntriesVarargs(value: ParameterMapEntry*): Self = StObject.set(x, "MapEntries", js.Array(value*))
    
    inline def setValues(value: StringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
