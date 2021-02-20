package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayProperties extends StObject {
  
  /**
    * The size of the array job.
    */
  var size: js.UndefOr[Integer] = js.native
}
object ArrayProperties {
  
  @scala.inline
  def apply(): ArrayProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayProperties]
  }
  
  @scala.inline
  implicit class ArrayPropertiesMutableBuilder[Self <: ArrayProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
