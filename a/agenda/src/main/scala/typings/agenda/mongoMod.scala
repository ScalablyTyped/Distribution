package typings.agenda

import typings.agenda.agendaMod.Agenda
import typings.mongodb.mod.AnyError
import typings.mongodb.mod.Collection
import typings.mongodb.mod.Db
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoMod {
  
  @JSImport("agenda/dist/agenda/mongo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mongo(mdb: Db): Agenda = ^.asInstanceOf[js.Dynamic].applyDynamic("mongo")(mdb.asInstanceOf[js.Any]).asInstanceOf[Agenda]
  inline def mongo(mdb: Db, collection: String): Agenda = (^.asInstanceOf[js.Dynamic].applyDynamic("mongo")(mdb.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[Agenda]
  inline def mongo(
    mdb: Db,
    collection: String,
    cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
  ): Agenda = (^.asInstanceOf[js.Dynamic].applyDynamic("mongo")(mdb.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Agenda]
  inline def mongo(
    mdb: Db,
    collection: Unit,
    cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
  ): Agenda = (^.asInstanceOf[js.Dynamic].applyDynamic("mongo")(mdb.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Agenda]
}
