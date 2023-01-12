package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerImage extends StObject {
  
  /**
    * The URI locating the container image.
    */
  var uri: Uri
}
object ContainerImage {
  
  inline def apply(uri: Uri): ContainerImage = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerImage] (val x: Self) extends AnyVal {
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
