package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGeoProjectionMod {
  
  @JSImport("@antv/data-set/lib/util/get-geo-projection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(projection: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(projection.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def default(projection: String, exportRaw: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(projection.asInstanceOf[js.Any], exportRaw.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
