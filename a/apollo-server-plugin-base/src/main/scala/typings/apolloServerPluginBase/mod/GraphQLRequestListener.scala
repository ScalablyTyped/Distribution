package typings.apolloServerPluginBase.mod

import typings.apolloServerTypes.mod.GraphQLRequestContextDidEncounterErrors
import typings.apolloServerTypes.mod.GraphQLRequestContextDidResolveOperation
import typings.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typings.apolloServerTypes.mod.GraphQLRequestContextParsingDidStart
import typings.apolloServerTypes.mod.GraphQLRequestContextResponseForOperation
import typings.apolloServerTypes.mod.GraphQLRequestContextValidationDidStart
import typings.apolloServerTypes.mod.GraphQLRequestContextWillSendResponse
import typings.apolloServerTypes.mod.GraphQLResponse
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestListener[TContext] extends js.Object {
  var didEncounterErrors: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextDidEncounterErrors[TContext], 
      ValueOrPromise[Unit]
    ]
  ] = js.undefined
  var didResolveOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextDidResolveOperation[TContext], 
      ValueOrPromise[Unit]
    ]
  ] = js.undefined
  var executionDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextExecutionDidStart[TContext], 
      (js.Function1[/* err */ js.UndefOr[Error], Unit]) | Unit
    ]
  ] = js.undefined
  var parsingDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextParsingDidStart[TContext], 
      (js.Function1[/* err */ js.UndefOr[Error], Unit]) | Unit
    ]
  ] = js.undefined
  var responseForOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextResponseForOperation[TContext], 
      ValueOrPromise[GraphQLResponse | Null]
    ]
  ] = js.undefined
  var validationDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextValidationDidStart[TContext], 
      (js.Function1[/* err */ js.UndefOr[js.Array[Error]], Unit]) | Unit
    ]
  ] = js.undefined
  var willSendResponse: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextWillSendResponse[TContext], 
      ValueOrPromise[Unit]
    ]
  ] = js.undefined
}

object GraphQLRequestListener {
  @scala.inline
  def apply[TContext](
    didEncounterErrors: /* requestContext */ GraphQLRequestContextDidEncounterErrors[TContext] => ValueOrPromise[Unit] = null,
    didResolveOperation: /* requestContext */ GraphQLRequestContextDidResolveOperation[TContext] => ValueOrPromise[Unit] = null,
    executionDidStart: /* requestContext */ GraphQLRequestContextExecutionDidStart[TContext] => (js.Function1[/* err */ js.UndefOr[Error], Unit]) | Unit = null,
    parsingDidStart: /* requestContext */ GraphQLRequestContextParsingDidStart[TContext] => (js.Function1[/* err */ js.UndefOr[Error], Unit]) | Unit = null,
    responseForOperation: /* requestContext */ GraphQLRequestContextResponseForOperation[TContext] => ValueOrPromise[GraphQLResponse | Null] = null,
    validationDidStart: /* requestContext */ GraphQLRequestContextValidationDidStart[TContext] => (js.Function1[/* err */ js.UndefOr[js.Array[Error]], Unit]) | Unit = null,
    willSendResponse: /* requestContext */ GraphQLRequestContextWillSendResponse[TContext] => ValueOrPromise[Unit] = null
  ): GraphQLRequestListener[TContext] = {
    val __obj = js.Dynamic.literal()
    if (didEncounterErrors != null) __obj.updateDynamic("didEncounterErrors")(js.Any.fromFunction1(didEncounterErrors))
    if (didResolveOperation != null) __obj.updateDynamic("didResolveOperation")(js.Any.fromFunction1(didResolveOperation))
    if (executionDidStart != null) __obj.updateDynamic("executionDidStart")(js.Any.fromFunction1(executionDidStart))
    if (parsingDidStart != null) __obj.updateDynamic("parsingDidStart")(js.Any.fromFunction1(parsingDidStart))
    if (responseForOperation != null) __obj.updateDynamic("responseForOperation")(js.Any.fromFunction1(responseForOperation))
    if (validationDidStart != null) __obj.updateDynamic("validationDidStart")(js.Any.fromFunction1(validationDidStart))
    if (willSendResponse != null) __obj.updateDynamic("willSendResponse")(js.Any.fromFunction1(willSendResponse))
    __obj.asInstanceOf[GraphQLRequestListener[TContext]]
  }
}

