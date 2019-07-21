package typings
package apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestListener[TContext] extends js.Object {
  var didEncounterErrors: js.UndefOr[
    js.Function1[
      /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
        apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.errors
      ], 
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[scala.Unit]
    ]
  ] = js.undefined
  var didResolveOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
        apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
      ], 
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[scala.Unit]
    ]
  ] = js.undefined
  var executionDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
        apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
      ], 
      (js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | scala.Unit
    ]
  ] = js.undefined
  var parsingDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
        apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source
      ], 
      (js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | scala.Unit
    ]
  ] = js.undefined
  var responseForOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
        apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
      ], 
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[
        apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLResponse | scala.Null
      ]
    ]
  ] = js.undefined
  var validationDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
        apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document
      ], 
      (js.Function1[/* err */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]) | scala.Unit
    ]
  ] = js.undefined
  var willSendResponse: js.UndefOr[
    js.Function1[
      /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
        apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.response
      ], 
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[scala.Unit]
    ]
  ] = js.undefined
}

object GraphQLRequestListener {
  @scala.inline
  def apply[TContext](
    didEncounterErrors: /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.errors
    ] => apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[scala.Unit] = null,
    didResolveOperation: /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
    ] => apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[scala.Unit] = null,
    executionDidStart: /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
    ] => (js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | scala.Unit = null,
    parsingDidStart: /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source
    ] => (js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | scala.Unit = null,
    responseForOperation: /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
    ] => apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLResponse | scala.Null
    ] = null,
    validationDidStart: /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document
    ] => (js.Function1[/* err */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]) | scala.Unit = null,
    willSendResponse: /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext], 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.response
    ] => apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[scala.Unit] = null
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

