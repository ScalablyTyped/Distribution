package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetSummary extends StObject {
  
  /**
    *  The hashes of the asset. 
    */
  var hashes: js.UndefOr[AssetHashes] = js.undefined
  
  /**
    *  The name of the asset. 
    */
  var name: AssetName
  
  /**
    *  The size of the asset. 
    */
  var size: js.UndefOr[LongOptional] = js.undefined
}
object AssetSummary {
  
  inline def apply(name: AssetName): AssetSummary = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSummary]
  }
  
  extension [Self <: AssetSummary](x: Self) {
    
    inline def setHashes(value: AssetHashes): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    inline def setName(value: AssetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: LongOptional): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
