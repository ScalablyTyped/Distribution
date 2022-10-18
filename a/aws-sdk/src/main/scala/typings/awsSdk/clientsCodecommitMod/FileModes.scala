package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileModes extends StObject {
  
  /**
    * The file mode of a file in the base of a merge or pull request.
    */
  var base: js.UndefOr[FileModeTypeEnum] = js.undefined
  
  /**
    * The file mode of a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[FileModeTypeEnum] = js.undefined
  
  /**
    * The file mode of a file in the source of a merge or pull request.
    */
  var source: js.UndefOr[FileModeTypeEnum] = js.undefined
}
object FileModes {
  
  inline def apply(): FileModes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileModes]
  }
  
  extension [Self <: FileModes](x: Self) {
    
    inline def setBase(value: FileModeTypeEnum): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setDestination(value: FileModeTypeEnum): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setSource(value: FileModeTypeEnum): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
