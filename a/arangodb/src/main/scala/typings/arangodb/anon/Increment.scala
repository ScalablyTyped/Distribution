package typings.arangodb.anon

import typings.arangodb.ArangoDB.KeyGeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Increment extends js.Object {
  
  var allowUserKeys: Boolean = js.native
  
  var increment: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var `type`: KeyGeneratorType = js.native
}
object Increment {
  
  @scala.inline
  def apply(allowUserKeys: Boolean, `type`: KeyGeneratorType): Increment = {
    val __obj = js.Dynamic.literal(allowUserKeys = allowUserKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Increment]
  }
  
  @scala.inline
  implicit class IncrementOps[Self <: Increment] (val x: Self) extends AnyVal {
    
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
    def setAllowUserKeys(value: Boolean): Self = this.set("allowUserKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: KeyGeneratorType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
