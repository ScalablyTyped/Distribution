package typings.agenda

import typings.mongodb.mod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableMod {
  
  @JSImport("agenda/dist/agenda/enable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[js.Promise[Double]]
  inline def enable(query: Filter[Any]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
}
