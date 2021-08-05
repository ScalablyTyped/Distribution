package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XLibraryQueryExecutable
  extends StObject
     with XInterface {
  
  def HasExecutableCode(name: String): Boolean
}
object XLibraryQueryExecutable {
  
  inline def apply(
    HasExecutableCode: String => Boolean,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLibraryQueryExecutable = {
    val __obj = js.Dynamic.literal(HasExecutableCode = js.Any.fromFunction1(HasExecutableCode), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLibraryQueryExecutable]
  }
  
  extension [Self <: XLibraryQueryExecutable](x: Self) {
    
    inline def setHasExecutableCode(value: String => Boolean): Self = StObject.set(x, "HasExecutableCode", js.Any.fromFunction1(value))
  }
}
