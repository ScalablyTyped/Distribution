package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeOperations extends StObject {
  
  /**
    * The operation on a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[ChangeTypeEnum] = js.undefined
  
  /**
    * The operation (add, modify, or delete) on a file in the source of a merge or pull request.
    */
  var source: js.UndefOr[ChangeTypeEnum] = js.undefined
}
object MergeOperations {
  
  inline def apply(): MergeOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeOperations] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: ChangeTypeEnum): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setSource(value: ChangeTypeEnum): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
