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
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
      ], 
      apolloDashServerDashPluginDashBaseLib.ValueOrPromise[scala.Unit]
    ]
  ] = js.undefined
  var executionDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
      ], 
      js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
    ]
  ] = js.undefined
  var parsingDidStart: js.UndefOr[
    js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ /* requestContext */ js.Any, 
      js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
    ]
  ] = js.undefined
  var validationDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document
      ], 
      js.Function1[/* err */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]
    ]
  ] = js.undefined
  var willSendResponse: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.response
      ], 
      apolloDashServerDashPluginDashBaseLib.ValueOrPromise[scala.Unit]
    ]
  ] = js.undefined
}

object GraphQLRequestListener {
  @scala.inline
  def apply[TContext](
    didResolveOperation: js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
      ], 
      apolloDashServerDashPluginDashBaseLib.ValueOrPromise[scala.Unit]
    ] = null,
    executionDidStart: js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operationName | apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.operation
      ], 
      js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
    ] = null,
    parsingDidStart: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ /* requestContext */ js.Any, 
      js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
    ] = null,
    validationDidStart: js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.document
      ], 
      js.Function1[/* err */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]
    ] = null,
    willSendResponse: js.Function1[
      /* requestContext */ WithRequired[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ _, 
        apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseLibStrings.response
      ], 
      apolloDashServerDashPluginDashBaseLib.ValueOrPromise[scala.Unit]
    ] = null
  ): GraphQLRequestListener[TContext] = {
    val __obj = js.Dynamic.literal()
    if (didResolveOperation != null) __obj.updateDynamic("didResolveOperation")(didResolveOperation)
    if (executionDidStart != null) __obj.updateDynamic("executionDidStart")(executionDidStart)
    if (parsingDidStart != null) __obj.updateDynamic("parsingDidStart")(parsingDidStart)
    if (validationDidStart != null) __obj.updateDynamic("validationDidStart")(validationDidStart)
    if (willSendResponse != null) __obj.updateDynamic("willSendResponse")(willSendResponse)
    __obj.asInstanceOf[GraphQLRequestListener[TContext]]
  }
}

