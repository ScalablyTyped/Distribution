package typings.awsLambdaFastify

import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Context
import typings.fastify.typesInstanceMod.FastifyInstance
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.fastify.typesReplyMod.FastifyReply
import typings.fastify.typesRequestMod.FastifyRequest
import typings.fastify.typesRouteMod.RouteGenericInterface
import typings.fastify.typesSchemaMod.FastifySchema
import typings.fastify.typesTypeProviderMod.FastifyTypeProviderDefault
import typings.fastify.typesTypeProviderMod.ResolveFastifyReplyType
import typings.fastify.typesTypeProviderMod.ResolveFastifyRequestType
import typings.fastify.typesUtilsMod.ContextConfigDefault
import typings.fastify.typesUtilsMod.RawReplyDefaultExpression
import typings.fastify.typesUtilsMod.RawRequestDefaultExpression
import typings.fastify.typesUtilsMod.RawServerDefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    app: FastifyInstance[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      FastifyBaseLogger, 
      FastifyTypeProviderDefault
    ]
  ): Handler[
    FastifyRequest[
      RouteGenericInterface, 
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      FastifySchema, 
      FastifyTypeProviderDefault, 
      ContextConfigDefault, 
      FastifyBaseLogger, 
      ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
    ], 
    FastifyReply[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      RouteGenericInterface, 
      ContextConfigDefault, 
      FastifySchema, 
      FastifyTypeProviderDefault, 
      ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
    ]
  ] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Handler[
    FastifyRequest[
      RouteGenericInterface, 
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      FastifySchema, 
      FastifyTypeProviderDefault, 
      ContextConfigDefault, 
      FastifyBaseLogger, 
      ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
    ], 
    FastifyReply[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      RouteGenericInterface, 
      ContextConfigDefault, 
      FastifySchema, 
      FastifyTypeProviderDefault, 
      ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
    ]
  ]]
  inline def apply(
    app: FastifyInstance[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      FastifyBaseLogger, 
      FastifyTypeProviderDefault
    ],
    options: AwsLambdaFastifyOptions
  ): Handler[
    FastifyRequest[
      RouteGenericInterface, 
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      FastifySchema, 
      FastifyTypeProviderDefault, 
      ContextConfigDefault, 
      FastifyBaseLogger, 
      ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
    ], 
    FastifyReply[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      RouteGenericInterface, 
      ContextConfigDefault, 
      FastifySchema, 
      FastifyTypeProviderDefault, 
      ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
    ]
  ] = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler[
    FastifyRequest[
      RouteGenericInterface, 
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      FastifySchema, 
      FastifyTypeProviderDefault, 
      ContextConfigDefault, 
      FastifyBaseLogger, 
      ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
    ], 
    FastifyReply[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      RouteGenericInterface, 
      ContextConfigDefault, 
      FastifySchema, 
      FastifyTypeProviderDefault, 
      ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
    ]
  ]]
  
  @JSImport("aws-lambda-fastify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AwsLambdaFastifyOptions extends StObject {
    
    var binaryMimeTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var callbackWaitsForEmptyEventLoop: js.UndefOr[Boolean] = js.undefined
  }
  object AwsLambdaFastifyOptions {
    
    inline def apply(): AwsLambdaFastifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwsLambdaFastifyOptions]
    }
    
    extension [Self <: AwsLambdaFastifyOptions](x: Self) {
      
      inline def setBinaryMimeTypes(value: js.Array[String]): Self = StObject.set(x, "binaryMimeTypes", value.asInstanceOf[js.Any])
      
      inline def setBinaryMimeTypesUndefined: Self = StObject.set(x, "binaryMimeTypes", js.undefined)
      
      inline def setBinaryMimeTypesVarargs(value: String*): Self = StObject.set(x, "binaryMimeTypes", js.Array(value*))
      
      inline def setCallbackWaitsForEmptyEventLoop(value: Boolean): Self = StObject.set(x, "callbackWaitsForEmptyEventLoop", value.asInstanceOf[js.Any])
      
      inline def setCallbackWaitsForEmptyEventLoopUndefined: Self = StObject.set(x, "callbackWaitsForEmptyEventLoop", js.undefined)
    }
  }
  
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ Context, 
    /* callback */ js.UndefOr[Callback[TResult]], 
    Unit | js.Promise[TResult]
  ]
}
