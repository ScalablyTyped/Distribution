package typings.ava.pluginMod.SharedWorker.Plugin

import typings.ava.pluginMod.SharedWorker.ProtocolIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationOptions[Identifier /* <: ProtocolIdentifier */, Data] extends js.Object {
  
  val filename: String = js.native
  
  val initialData: js.UndefOr[Data] = js.native
  
  val supportedProtocols: js.Array[Identifier] = js.native
  
  val teardown: js.UndefOr[js.Function0[Unit]] = js.native
}
object RegistrationOptions {
  
  @scala.inline
  def apply[Identifier /* <: ProtocolIdentifier */, Data](filename: String, supportedProtocols: js.Array[Identifier]): RegistrationOptions[Identifier, Data] = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationOptions[Identifier, Data]]
  }
  
  @scala.inline
  implicit class RegistrationOptionsOps[Self <: RegistrationOptions[_, _], Identifier /* <: ProtocolIdentifier */, Data] (val x: Self with (RegistrationOptions[Identifier, Data])) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedProtocolsVarargs(value: Identifier*): Self = this.set("supportedProtocols", js.Array(value :_*))
    
    @scala.inline
    def setSupportedProtocols(value: js.Array[Identifier]): Self = this.set("supportedProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialData(value: Data): Self = this.set("initialData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialData: Self = this.set("initialData", js.undefined)
    
    @scala.inline
    def setTeardown(value: () => Unit): Self = this.set("teardown", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
  }
}
