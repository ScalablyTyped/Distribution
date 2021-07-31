package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to read the corresponding object from an input stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
trait XActiveDataSink
  extends StObject
     with XInterface {
  
  /** @returns the plugged stream. */
  var InputStream: XInputStream
  
  /** @returns the plugged stream. */
  def getInputStream(): XInputStream
  
  /**
    * plugs the input stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for an {@link XConnectable} and connect both.
    */
  def setInputStream(aStream: XInputStream): Unit
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
  implicit class XActiveDataSinkMutableBuilder[Self <: XActiveDataSink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInputStream(value: () => XInputStream): Self = StObject.set(x, "getInputStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInputStream(value: XInputStream): Self = StObject.set(x, "InputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetInputStream(value: XInputStream => Unit): Self = StObject.set(x, "setInputStream", js.Any.fromFunction1(value))
  }
}
