package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConnection extends UpdateConnection {
  
  /**
    * The name of the connection. Must start and end with an
    * alphanumeric character and can only contain alphanumeric
    * characters and '-'. Max length 128.
    */
  var name: String = js.native
  
  /**
    * The identity provider identifier for the connection.
    */
  var strategy: Strategy = js.native
}
object CreateConnection {
  
  @scala.inline
  def apply(name: String, strategy: Strategy): CreateConnection = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnection]
  }
  
  @scala.inline
  implicit class CreateConnectionOps[Self <: CreateConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: Strategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
  }
}
