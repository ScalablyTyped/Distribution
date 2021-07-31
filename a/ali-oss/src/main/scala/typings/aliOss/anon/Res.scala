package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Res extends StObject {
  
  var res: NormalSuccessResponse
  
  var stream: js.Any
}
object Res {
  
  @scala.inline
  def apply(res: NormalSuccessResponse, stream: js.Any): Res = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Res]
  }
  
  @scala.inline
  implicit class ResMutableBuilder[Self <: Res] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
