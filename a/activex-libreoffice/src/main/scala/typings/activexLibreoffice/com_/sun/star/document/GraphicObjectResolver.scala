package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
@js.native
trait GraphicObjectResolver extends XGraphicObjectResolver {
  
  def createWithStorage(Storage: XStorage): Unit = js.native
}
object GraphicObjectResolver {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithStorage: XStorage => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resolveGraphicObjectURL: String => String
  ): GraphicObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithStorage = js.Any.fromFunction1(createWithStorage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveGraphicObjectURL = js.Any.fromFunction1(resolveGraphicObjectURL))
    __obj.asInstanceOf[GraphicObjectResolver]
  }
  
  @scala.inline
  implicit class GraphicObjectResolverMutableBuilder[Self <: GraphicObjectResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithStorage(value: XStorage => Unit): Self = StObject.set(x, "createWithStorage", js.Any.fromFunction1(value))
  }
}
