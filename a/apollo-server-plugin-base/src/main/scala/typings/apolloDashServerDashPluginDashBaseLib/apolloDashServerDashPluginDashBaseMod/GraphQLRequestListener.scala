package typings
package apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestListener[TContext] extends js.Object {
  var didResolveOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
      ], 
      ValueOrPromise[scala.Unit]
    ]
  ] = js.undefined
  var executionDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
      ], 
      js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
    ]
  ] = js.undefined
  var parsingDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source
      ], 
      js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
    ]
  ] = js.undefined
  var responseForOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
      ], 
      ValueOrPromise[
        (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLResponse */ _) | scala.Null
      ]
    ]
  ] = js.undefined
  var validationDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document
      ], 
      js.Function1[/* err */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]
    ]
  ] = js.undefined
  var willSendResponse: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.response
      ], 
      ValueOrPromise[scala.Unit]
    ]
  ] = js.undefined
}

object GraphQLRequestListener {
  @scala.inline
  def apply[TContext](
    didResolveOperation: /* requestContext */ WithRequired[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
    ] => ValueOrPromise[scala.Unit] = null,
    executionDidStart: /* requestContext */ WithRequired[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
    ] => js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit] = null,
    parsingDidStart: /* requestContext */ WithRequired[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source
    ] => js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit] = null,
    responseForOperation: /* requestContext */ WithRequired[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
    ] => ValueOrPromise[
      (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLResponse */ _) | scala.Null
    ] = null,
    validationDidStart: /* requestContext */ WithRequired[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.source | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document
    ] => js.Function1[/* err */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit] = null,
    willSendResponse: /* requestContext */ WithRequired[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.metrics | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.response
    ] => ValueOrPromise[scala.Unit] = null
  ): GraphQLRequestListener[TContext] = {
    val __obj = js.Dynamic.literal()
    if (didResolveOperation != null) __obj.updateDynamic("didResolveOperation")(js.Any.fromFunction1(didResolveOperation))
    if (executionDidStart != null) __obj.updateDynamic("executionDidStart")(js.Any.fromFunction1(executionDidStart))
    if (parsingDidStart != null) __obj.updateDynamic("parsingDidStart")(js.Any.fromFunction1(parsingDidStart))
    if (responseForOperation != null) __obj.updateDynamic("responseForOperation")(js.Any.fromFunction1(responseForOperation))
    if (validationDidStart != null) __obj.updateDynamic("validationDidStart")(js.Any.fromFunction1(validationDidStart))
    if (willSendResponse != null) __obj.updateDynamic("willSendResponse")(js.Any.fromFunction1(willSendResponse))
    __obj.asInstanceOf[GraphQLRequestListener[TContext]]
  }
}

