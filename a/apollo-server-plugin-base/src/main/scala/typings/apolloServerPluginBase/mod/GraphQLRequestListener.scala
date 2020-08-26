package typings.apolloServerPluginBase.mod

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

@js.native
trait GraphQLRequestListener[TContext /* <: BaseContext */] extends AnyFunctionMap {
  var didEncounterErrors: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextDidEncounterErrors[TContext], 
      ValueOrPromise[Unit]
    ]
  ] = js.native
  var didResolveOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextDidResolveOperation[TContext], 
      ValueOrPromise[Unit]
    ]
  ] = js.native
  var didResolveSource: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextDidResolveSource[TContext], 
      ValueOrPromise[Unit]
    ]
  ] = js.native
  var executionDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextExecutionDidStart[TContext], 
      GraphQLRequestExecutionListener[BaseContext] | GraphQLRequestListenerExecutionDidEnd | Unit
    ]
  ] = js.native
  var parsingDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextParsingDidStart[TContext], 
      GraphQLRequestListenerParsingDidEnd | Unit
    ]
  ] = js.native
  var responseForOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextResponseForOperation[TContext], 
      ValueOrPromise[GraphQLResponse | Null]
    ]
  ] = js.native
  var validationDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextValidationDidStart[TContext], 
      GraphQLRequestListenerValidationDidEnd | Unit
    ]
  ] = js.native
  var willSendResponse: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContextWillSendResponse[TContext], 
      ValueOrPromise[Unit]
    ]
  ] = js.native
}

object GraphQLRequestListener {
  @scala.inline
  def apply[/* <: typings.apolloServerTypes.mod.BaseContext */ TContext](): GraphQLRequestListener[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLRequestListener[TContext]]
  }
  @scala.inline
  implicit class GraphQLRequestListenerOps[Self <: GraphQLRequestListener[_], /* <: typings.apolloServerTypes.mod.BaseContext */ TContext] (val x: Self with GraphQLRequestListener[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDidEncounterErrors(
      value: /* requestContext */ GraphQLRequestContextDidEncounterErrors[TContext] => ValueOrPromise[Unit]
    ): Self = this.set("didEncounterErrors", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDidEncounterErrors: Self = this.set("didEncounterErrors", js.undefined)
    @scala.inline
    def setDidResolveOperation(
      value: /* requestContext */ GraphQLRequestContextDidResolveOperation[TContext] => ValueOrPromise[Unit]
    ): Self = this.set("didResolveOperation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDidResolveOperation: Self = this.set("didResolveOperation", js.undefined)
    @scala.inline
    def setDidResolveSource(
      value: /* requestContext */ GraphQLRequestContextDidResolveSource[TContext] => ValueOrPromise[Unit]
    ): Self = this.set("didResolveSource", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDidResolveSource: Self = this.set("didResolveSource", js.undefined)
    @scala.inline
    def setExecutionDidStart(
      value: /* requestContext */ GraphQLRequestContextExecutionDidStart[TContext] => GraphQLRequestExecutionListener[BaseContext] | GraphQLRequestListenerExecutionDidEnd | Unit
    ): Self = this.set("executionDidStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExecutionDidStart: Self = this.set("executionDidStart", js.undefined)
    @scala.inline
    def setParsingDidStart(
      value: /* requestContext */ GraphQLRequestContextParsingDidStart[TContext] => GraphQLRequestListenerParsingDidEnd | Unit
    ): Self = this.set("parsingDidStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParsingDidStart: Self = this.set("parsingDidStart", js.undefined)
    @scala.inline
    def setResponseForOperation(
      value: /* requestContext */ GraphQLRequestContextResponseForOperation[TContext] => ValueOrPromise[GraphQLResponse | Null]
    ): Self = this.set("responseForOperation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResponseForOperation: Self = this.set("responseForOperation", js.undefined)
    @scala.inline
    def setValidationDidStart(
      value: /* requestContext */ GraphQLRequestContextValidationDidStart[TContext] => GraphQLRequestListenerValidationDidEnd | Unit
    ): Self = this.set("validationDidStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidationDidStart: Self = this.set("validationDidStart", js.undefined)
    @scala.inline
    def setWillSendResponse(
      value: /* requestContext */ GraphQLRequestContextWillSendResponse[TContext] => ValueOrPromise[Unit]
    ): Self = this.set("willSendResponse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWillSendResponse: Self = this.set("willSendResponse", js.undefined)
  }
  
}

