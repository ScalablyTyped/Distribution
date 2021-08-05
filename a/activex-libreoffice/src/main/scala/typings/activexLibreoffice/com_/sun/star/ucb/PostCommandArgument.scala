package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The argument for the command "post".
  * @see XCommandProcessor
  */
trait PostCommandArgument extends StObject {
  
  /** The data sink receiving the returned contents (supporting either {@link com.sun.star.io.XActiveDataSink} or {@link com.sun.star.io.XOutputStream} ). */
  var Sink: XInterface
  
  /** The data source containing the data to post. */
  var Source: XInputStream
}
object PostCommandArgument {
  
  inline def apply(Sink: XInterface, Source: XInputStream): PostCommandArgument = {
    val __obj = js.Dynamic.literal(Sink = Sink.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommandArgument]
  }
  
  extension [Self <: PostCommandArgument](x: Self) {
    
    inline def setSink(value: XInterface): Self = StObject.set(x, "Sink", value.asInstanceOf[js.Any])
    
    inline def setSource(value: XInputStream): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
