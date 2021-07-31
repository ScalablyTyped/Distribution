package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/playparameters
trait PlayParameters extends StObject {
  
  var id: String
  
  var kind: String
}
object PlayParameters {
  
  @scala.inline
  def apply(id: String, kind: String): PlayParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayParameters]
  }
  
  @scala.inline
  implicit class PlayParametersMutableBuilder[Self <: PlayParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
