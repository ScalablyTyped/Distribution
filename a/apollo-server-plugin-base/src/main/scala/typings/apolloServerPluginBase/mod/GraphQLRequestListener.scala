package typings.apolloServerPluginBase.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServerTypes.mod.AnyFunction
import typings.apolloServerTypes.mod.AnyFunctionMap
import typings.apolloServerTypes.mod.BaseContext
import typings.apolloServerTypes.mod.GraphQLRequestContextDidEncounterErrors
import typings.apolloServerTypes.mod.GraphQLRequestContextDidResolveOperation
import typings.apolloServerTypes.mod.GraphQLRequestContextDidResolveSource
import typings.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typings.apolloServerTypes.mod.GraphQLRequestContextParsingDidStart
import typings.apolloServerTypes.mod.GraphQLRequestContextResponseForOperation
import typings.apolloServerTypes.mod.GraphQLRequestContextValidationDidStart
import typings.apolloServerTypes.mod.GraphQLRequestContextWillSendResponse
import typings.apolloServerTypes.mod.GraphQLResponse
import typings.apolloServerTypes.mod.ValueOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestListener[TContext /* <: BaseContext */] extends AnyFunctionMap {
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
  var didResolveSource: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextDidResolveSource[TContext], 
      ValueOrPromise[Unit]
    ]
  ] = js.undefined
  var executionDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextExecutionDidStart[TContext], 
      GraphQLRequestExecutionListener[BaseContext] | GraphQLRequestListenerExecutionDidEnd | Unit
    ]
  ] = js.undefined
  var parsingDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextParsingDidStart[TContext], 
      GraphQLRequestListenerParsingDidEnd | Unit
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
      GraphQLRequestListenerValidationDidEnd | Unit
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
  def apply[/* <: typings.apolloServerTypes.mod.BaseContext */ TContext](
    StringDictionary: StringDictionary[js.UndefOr[AnyFunction]] = null,
    didEncounterErrors: /* requestContext */ GraphQLRequestContextDidEncounterErrors[TContext] => ValueOrPromise[Unit] = null,
    didResolveOperation: /* requestContext */ GraphQLRequestContextDidResolveOperation[TContext] => ValueOrPromise[Unit] = null,
    didResolveSource: /* requestContext */ GraphQLRequestContextDidResolveSource[TContext] => ValueOrPromise[Unit] = null,
    executionDidStart: /* requestContext */ GraphQLRequestContextExecutionDidStart[TContext] => GraphQLRequestExecutionListener[BaseContext] | GraphQLRequestListenerExecutionDidEnd | Unit = null,
    parsingDidStart: /* requestContext */ GraphQLRequestContextParsingDidStart[TContext] => GraphQLRequestListenerParsingDidEnd | Unit = null,
    responseForOperation: /* requestContext */ GraphQLRequestContextResponseForOperation[TContext] => ValueOrPromise[GraphQLResponse | Null] = null,
    validationDidStart: /* requestContext */ GraphQLRequestContextValidationDidStart[TContext] => GraphQLRequestListenerValidationDidEnd | Unit = null,
    willSendResponse: /* requestContext */ GraphQLRequestContextWillSendResponse[TContext] => ValueOrPromise[Unit] = null
  ): GraphQLRequestListener[TContext] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (didEncounterErrors != null) __obj.updateDynamic("didEncounterErrors")(js.Any.fromFunction1(didEncounterErrors))
    if (didResolveOperation != null) __obj.updateDynamic("didResolveOperation")(js.Any.fromFunction1(didResolveOperation))
    if (didResolveSource != null) __obj.updateDynamic("didResolveSource")(js.Any.fromFunction1(didResolveSource))
    if (executionDidStart != null) __obj.updateDynamic("executionDidStart")(js.Any.fromFunction1(executionDidStart))
    if (parsingDidStart != null) __obj.updateDynamic("parsingDidStart")(js.Any.fromFunction1(parsingDidStart))
    if (responseForOperation != null) __obj.updateDynamic("responseForOperation")(js.Any.fromFunction1(responseForOperation))
    if (validationDidStart != null) __obj.updateDynamic("validationDidStart")(js.Any.fromFunction1(validationDidStart))
    if (willSendResponse != null) __obj.updateDynamic("willSendResponse")(js.Any.fromFunction1(willSendResponse))
    __obj.asInstanceOf[GraphQLRequestListener[TContext]]
  }
}

