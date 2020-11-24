package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The argument for the command "post".
  * @see XCommandProcessor
  */
@js.native
trait PostCommandArgument extends js.Object {
  
  /** The data sink receiving the returned contents (supporting either {@link com.sun.star.io.XActiveDataSink} or {@link com.sun.star.io.XOutputStream} ). */
  var Sink: XInterface = js.native
  
  /** The data source containing the data to post. */
  var Source: XInputStream = js.native
}
object PostCommandArgument {
  
  @scala.inline
  def apply(Sink: XInterface, Source: XInputStream): PostCommandArgument = {
    val __obj = js.Dynamic.literal(Sink = Sink.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommandArgument]
  }
  
  @scala.inline
  implicit class PostCommandArgumentOps[Self <: PostCommandArgument] (val x: Self) extends AnyVal {
    
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
    def setSink(value: XInterface): Self = this.set("Sink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: XInputStream): Self = this.set("Source", value.asInstanceOf[js.Any])
  }
}
