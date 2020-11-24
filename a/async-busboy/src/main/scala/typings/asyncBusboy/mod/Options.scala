package typings.asyncBusboy.mod

import typings.busboy.busboy.BusboyConfig
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends BusboyConfig {
  
  def onFile(fieldname: String, file: ReadableStream, filename: String, encoding: String, mimetype: String): Unit = js.native
}
object Options {
  
  @scala.inline
  def apply(onFile: (String, ReadableStream, String, String, String) => Unit): Options = {
    val __obj = js.Dynamic.literal(onFile = js.Any.fromFunction5(onFile))
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setOnFile(value: (String, ReadableStream, String, String, String) => Unit): Self = this.set("onFile", js.Any.fromFunction5(value))
  }
}
