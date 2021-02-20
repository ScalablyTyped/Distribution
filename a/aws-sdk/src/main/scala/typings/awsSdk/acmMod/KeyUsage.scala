package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyUsage extends StObject {
  
  /**
    * A string value that contains a Key Usage extension name.
    */
  var Name: js.UndefOr[KeyUsageName] = js.native
}
object KeyUsage {
  
  @scala.inline
  def apply(): KeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyUsage]
  }
  
  @scala.inline
  implicit class KeyUsageMutableBuilder[Self <: KeyUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: KeyUsageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
