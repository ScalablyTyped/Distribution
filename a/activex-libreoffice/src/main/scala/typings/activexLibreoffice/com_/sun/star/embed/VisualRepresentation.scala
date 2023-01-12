package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.com_.sun.star.datatransfer.DataFlavor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** can contain a graphical representation in an arbitrary format. */
trait VisualRepresentation extends StObject {
  
  /** The data in the format specified by {@link Flavor} . */
  var Data: Any
  
  /** The format of the visual representation. */
  var Flavor: DataFlavor
}
object VisualRepresentation {
  
  inline def apply(Data: Any, Flavor: DataFlavor): VisualRepresentation = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Flavor = Flavor.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualRepresentation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualRepresentation] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setFlavor(value: DataFlavor): Self = StObject.set(x, "Flavor", value.asInstanceOf[js.Any])
  }
}
