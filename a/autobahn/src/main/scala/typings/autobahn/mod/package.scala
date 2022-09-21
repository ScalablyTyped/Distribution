package typings.autobahn.mod

import typings.autobahn.mod.^
import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def authCra: IAuthCra = ^.asInstanceOf[js.Dynamic].selectDynamic("auth_cra").asInstanceOf[IAuthCra]
inline def authCra_=(x: IAuthCra): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auth_cra")(x.asInstanceOf[js.Any])

inline def log: ILog = ^.asInstanceOf[js.Dynamic].selectDynamic("log").asInstanceOf[ILog]
inline def log_=(x: ILog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])

inline def transports: ITransports = ^.asInstanceOf[js.Dynamic].selectDynamic("transports").asInstanceOf[ITransports]
inline def transports_=(x: ITransports): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transports")(x.asInstanceOf[js.Any])

inline def util: IUtil = ^.asInstanceOf[js.Dynamic].selectDynamic("util").asInstanceOf[IUtil]
inline def util_=(x: IUtil): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("util")(x.asInstanceOf[js.Any])

type DeferFactory = js.Function0[Promise[Any]]

type OnChallengeHandler = js.Function3[
/* session */ Session, 
/* method */ String, 
/* extra */ Any, 
String | (js.Tuple2[String, Any]) | (Promise[String | (js.Tuple2[String, Any])])]

type OnInternalErrorHandler = js.Function2[/* error */ js.Object | Error, /* error_message */ js.UndefOr[String], Unit]

type OnUserErrorHandler = js.Function2[/* error */ js.Object | Error, /* error_message */ js.UndefOr[String], Unit]

type RegisterEndpoint[TResult, TArgs, TKWArgs] = js.Function3[
/* args */ js.UndefOr[TArgs], 
/* kwargs */ js.UndefOr[TKWArgs], 
/* details */ js.UndefOr[IInvocation], 
TResult]

type SubscribeHandler[TArgs, TKWArgs, TName] = js.Function3[
/* args */ js.UndefOr[TArgs], 
/* kwargs */ js.UndefOr[TKWArgs], 
/* details */ js.UndefOr[IEvent[TName]], 
Unit]
