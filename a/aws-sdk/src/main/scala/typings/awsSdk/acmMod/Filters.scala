package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  /**
    * Specify one or more ExtendedKeyUsage extension values.
    */
  var extendedKeyUsage: js.UndefOr[ExtendedKeyUsageFilterList] = js.undefined
  
  /**
    * Specify one or more algorithms that can be used to generate key pairs. Default filtering returns only RSA_2048 certificates. To return other certificate types, provide the desired type signatures in a comma-separated list. For example, "keyTypes": ["RSA_2048,RSA_4096"] returns both RSA_2048 and RSA_4096 certificates.
    */
  var keyTypes: js.UndefOr[KeyAlgorithmList] = js.undefined
  
  /**
    * Specify one or more KeyUsage extension values.
    */
  var keyUsage: js.UndefOr[KeyUsageFilterList] = js.undefined
}
object Filters {
  
  inline def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  
  extension [Self <: Filters](x: Self) {
    
    inline def setExtendedKeyUsage(value: ExtendedKeyUsageFilterList): Self = StObject.set(x, "extendedKeyUsage", value.asInstanceOf[js.Any])
    
    inline def setExtendedKeyUsageUndefined: Self = StObject.set(x, "extendedKeyUsage", js.undefined)
    
    inline def setExtendedKeyUsageVarargs(value: ExtendedKeyUsageName*): Self = StObject.set(x, "extendedKeyUsage", js.Array(value :_*))
    
    inline def setKeyTypes(value: KeyAlgorithmList): Self = StObject.set(x, "keyTypes", value.asInstanceOf[js.Any])
    
    inline def setKeyTypesUndefined: Self = StObject.set(x, "keyTypes", js.undefined)
    
    inline def setKeyTypesVarargs(value: KeyAlgorithm*): Self = StObject.set(x, "keyTypes", js.Array(value :_*))
    
    inline def setKeyUsage(value: KeyUsageFilterList): Self = StObject.set(x, "keyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "keyUsage", js.undefined)
    
    inline def setKeyUsageVarargs(value: KeyUsageName*): Self = StObject.set(x, "keyUsage", js.Array(value :_*))
  }
}
