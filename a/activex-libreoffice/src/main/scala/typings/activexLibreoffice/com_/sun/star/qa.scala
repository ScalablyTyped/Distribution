package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qa {
  
  /** Dumps the content into a string. This is an internal interface and should not be used outside of Libreoffice source code */
  trait XDumper
    extends StObject
       with XInterface {
    
    /**
      * dump the content into a string
      * @since LibreOffice 3.6
      */
    def dump(): String
  }
  object XDumper {
    
    inline def apply(acquire: () => Unit, dump: () => String, queryInterface: `type` => Any, release: () => Unit): XDumper = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dump = js.Any.fromFunction0(dump), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XDumper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XDumper] (val x: Self) extends AnyVal {
      
      inline def setDump(value: () => String): Self = StObject.set(x, "dump", js.Any.fromFunction0(value))
    }
  }
}
