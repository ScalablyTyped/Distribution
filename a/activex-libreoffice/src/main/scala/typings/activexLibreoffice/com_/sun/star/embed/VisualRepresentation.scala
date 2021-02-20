package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.com_.sun.star.datatransfer.DataFlavor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** can contain a graphical representation in an arbitrary format. */
@js.native
trait VisualRepresentation extends StObject {
  
  /** The data in the format specified by {@link Flavor} . */
  var Data: js.Any = js.native
  
  /** The format of the visual representation. */
  var Flavor: DataFlavor = js.native
}
object VisualRepresentation {
  
  @scala.inline
  def apply(Data: js.Any, Flavor: DataFlavor): VisualRepresentation = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Flavor = Flavor.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualRepresentation]
  }
  
  @scala.inline
  implicit class VisualRepresentationMutableBuilder[Self <: VisualRepresentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlavor(value: DataFlavor): Self = StObject.set(x, "Flavor", value.asInstanceOf[js.Any])
  }
}
