package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link XModel} instead of this
  * @deprecated Deprecated
  */
trait XFrameSetModel
  extends StObject
     with XInterface {
  
  var Source: String
  
  def getSource(): String
  
  def setSource(Source: String): Unit
}
object XFrameSetModel {
  
  inline def apply(
    Source: String,
    acquire: () => Unit,
    getSource: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSource: String => Unit
  ): XFrameSetModel = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSource = js.Any.fromFunction0(getSource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[XFrameSetModel]
  }
  
  extension [Self <: XFrameSetModel](x: Self) {
    
    inline def setGetSource(value: () => String): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
    
    inline def setSetSource(value: String => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
