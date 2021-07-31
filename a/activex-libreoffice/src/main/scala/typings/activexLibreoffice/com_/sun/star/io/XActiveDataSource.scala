package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * has to be implemented if the class should be able to write into an output stream.
  * @see XActiveDataControl.
  */
trait XActiveDataSource
  extends StObject
     with XInterface {
  
  /** @returns the plugged stream. */
  var OutputStream: XOutputStream
  
  /** @returns the plugged stream. */
  def getOutputStream(): XOutputStream
  
  /**
    * plugs the output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setOutputStream(aStream: XOutputStream): Unit
}
object XActiveDataSource {
  
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    acquire: () => Unit,
    getOutputStream: () => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setOutputStream: XOutputStream => Unit
  ): XActiveDataSource = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream))
    __obj.asInstanceOf[XActiveDataSource]
  }
  
  @scala.inline
  implicit class XActiveDataSourceMutableBuilder[Self <: XActiveDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetOutputStream(value: () => XOutputStream): Self = StObject.set(x, "getOutputStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOutputStream(value: XOutputStream): Self = StObject.set(x, "OutputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetOutputStream(value: XOutputStream => Unit): Self = StObject.set(x, "setOutputStream", js.Any.fromFunction1(value))
  }
}
