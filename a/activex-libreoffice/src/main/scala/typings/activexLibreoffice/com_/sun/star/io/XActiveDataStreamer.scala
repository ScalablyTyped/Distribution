package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to read and write the corresponding stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
trait XActiveDataStreamer
  extends StObject
     with XInterface {
  
  /** @returns the plugged stream. */
  var Stream: XStream
  
  /** @returns the plugged stream. */
  def getStream(): XStream
  
  /**
    * plugs the input/output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setStream(aStream: XStream): Unit
}
object XActiveDataStreamer {
  
  inline def apply(
    Stream: XStream,
    acquire: () => Unit,
    getStream: () => XStream,
    queryInterface: `type` => Any,
    release: () => Unit,
    setStream: XStream => Unit
  ): XActiveDataStreamer = {
    val __obj = js.Dynamic.literal(Stream = Stream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStream = js.Any.fromFunction0(getStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStream = js.Any.fromFunction1(setStream))
    __obj.asInstanceOf[XActiveDataStreamer]
  }
  
  extension [Self <: XActiveDataStreamer](x: Self) {
    
    inline def setGetStream(value: () => XStream): Self = StObject.set(x, "getStream", js.Any.fromFunction0(value))
    
    inline def setSetStream(value: XStream => Unit): Self = StObject.set(x, "setStream", js.Any.fromFunction1(value))
    
    inline def setStream(value: XStream): Self = StObject.set(x, "Stream", value.asInstanceOf[js.Any])
  }
}
