package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables a text object to copy attributed text from another text object. */
@js.native
trait XTextCopy extends XInterface {
  
  /**
    * copies the content from another text object.
    * @param xSource specifies the source text object.
    */
  def copyText(xSource: XTextCopy): Unit = js.native
}
object XTextCopy {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    copyText: XTextCopy => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextCopy = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copyText = js.Any.fromFunction1(copyText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextCopy]
  }
  
  @scala.inline
  implicit class XTextCopyMutableBuilder[Self <: XTextCopy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyText(value: XTextCopy => Unit): Self = StObject.set(x, "copyText", js.Any.fromFunction1(value))
  }
}
