package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to read the corresponding object from an input stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
@js.native
trait XActiveDataSink extends XInterface {
  
  /** @returns the plugged stream. */
  var InputStream: XInputStream = js.native
  
  /** @returns the plugged stream. */
  def getInputStream(): XInputStream = js.native
  
  /**
    * plugs the input stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for an {@link XConnectable} and connect both.
    */
  def setInputStream(aStream: XInputStream): Unit = js.native
}
object XActiveDataSink {
  
  @scala.inline
  def apply(
    InputStream: XInputStream,
    acquire: () => Unit,
    getInputStream: () => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setInputStream: XInputStream => Unit
  ): XActiveDataSink = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream))
    __obj.asInstanceOf[XActiveDataSink]
  }
  
  @scala.inline
  implicit class XActiveDataSinkOps[Self <: XActiveDataSink] (val x: Self) extends AnyVal {
    
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
    def setInputStream(value: XInputStream): Self = this.set("InputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInputStream(value: () => XInputStream): Self = this.set("getInputStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetInputStream(value: XInputStream => Unit): Self = this.set("setInputStream", js.Any.fromFunction1(value))
  }
}
