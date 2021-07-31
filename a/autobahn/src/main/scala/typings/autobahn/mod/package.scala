package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def authCra: typings.autobahn.mod.IAuthCra = typings.autobahn.mod.^.asInstanceOf[js.Dynamic].selectDynamic("auth_cra").asInstanceOf[typings.autobahn.mod.IAuthCra]
@scala.inline
def authCra_=(x: typings.autobahn.mod.IAuthCra): scala.Unit = typings.autobahn.mod.^.asInstanceOf[js.Dynamic].updateDynamic("auth_cra")(x.asInstanceOf[js.Any])

@scala.inline
def log: typings.autobahn.mod.ILog = typings.autobahn.mod.^.asInstanceOf[js.Dynamic].selectDynamic("log").asInstanceOf[typings.autobahn.mod.ILog]
@scala.inline
def log_=(x: typings.autobahn.mod.ILog): scala.Unit = typings.autobahn.mod.^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])

@scala.inline
def transports: typings.autobahn.mod.ITransports = typings.autobahn.mod.^.asInstanceOf[js.Dynamic].selectDynamic("transports").asInstanceOf[typings.autobahn.mod.ITransports]
@scala.inline
def transports_=(x: typings.autobahn.mod.ITransports): scala.Unit = typings.autobahn.mod.^.asInstanceOf[js.Dynamic].updateDynamic("transports")(x.asInstanceOf[js.Any])

@scala.inline
def util: typings.autobahn.mod.IUtil = typings.autobahn.mod.^.asInstanceOf[js.Dynamic].selectDynamic("util").asInstanceOf[typings.autobahn.mod.IUtil]
@scala.inline
def util_=(x: typings.autobahn.mod.IUtil): scala.Unit = typings.autobahn.mod.^.asInstanceOf[js.Dynamic].updateDynamic("util")(x.asInstanceOf[js.Any])

type DeferFactory = js.Function0[typings.when.When.Promise[js.Any]]

type OnChallengeHandler = js.Function3[
/* session */ typings.autobahn.mod.Session, 
/* method */ java.lang.String, 
/* extra */ js.Any, 
java.lang.String | typings.when.When.Promise[java.lang.String]]

type RegisterEndpoint = js.Function3[
/* args */ js.UndefOr[js.Array[js.Any]], 
/* kwargs */ js.UndefOr[js.Any], 
/* details */ js.UndefOr[typings.autobahn.mod.IInvocation], 
scala.Unit]

type SubscribeHandler = js.Function3[
/* args */ js.UndefOr[js.Array[js.Any] | js.Any], 
/* kwargs */ js.UndefOr[js.Any], 
/* details */ js.UndefOr[typings.autobahn.mod.IEvent], 
scala.Unit]
