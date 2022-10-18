package typings.agenda

import typings.mongodb.mod.AnyError
import typings.mongodb.mod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaDbInitMod {
  
  @JSImport("agenda/dist/agenda/db-init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dbInit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dbInit")().asInstanceOf[Unit]
  inline def dbInit(collection: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dbInit")(collection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def dbInit(
    collection: String,
    cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dbInit")(collection.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dbInit(
    collection: Unit,
    cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dbInit")(collection.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
