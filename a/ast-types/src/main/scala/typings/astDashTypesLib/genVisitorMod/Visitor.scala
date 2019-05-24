package typings
package astDashTypesLib.genVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[M] extends js.Object {
  var visitAnyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.AnyTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitArrayExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrayExpression, _], 
      _
    ]
  ] = js.undefined
  var visitArrayPattern: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrayPattern, _], 
      _
    ]
  ] = js.undefined
  var visitArrayTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrayTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitArrowFunctionExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrowFunctionExpression, _], 
      _
    ]
  ] = js.undefined
  var visitAssignmentExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.AssignmentExpression, _], 
      _
    ]
  ] = js.undefined
  var visitAssignmentPattern: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.AssignmentPattern, _], 
      _
    ]
  ] = js.undefined
  var visitAwaitExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.AwaitExpression, _], 
      _
    ]
  ] = js.undefined
  var visitBigIntLiteral: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BigIntLiteral, _], 
      _
    ]
  ] = js.undefined
  var visitBinaryExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BinaryExpression, _], 
      _
    ]
  ] = js.undefined
  var visitBindExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BindExpression, _], 
      _
    ]
  ] = js.undefined
  var visitBlock: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Block, _], 
      _
    ]
  ] = js.undefined
  var visitBlockStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BlockStatement, _], 
      _
    ]
  ] = js.undefined
  var visitBooleanLiteral: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BooleanLiteral, _], 
      _
    ]
  ] = js.undefined
  var visitBooleanLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BooleanLiteralTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitBooleanTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BooleanTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitBreakStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BreakStatement, _], 
      _
    ]
  ] = js.undefined
  var visitCallExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.CallExpression, _], 
      _
    ]
  ] = js.undefined
  var visitCatchClause: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.CatchClause, _], 
      _
    ]
  ] = js.undefined
  var visitClassBody: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassBody, _], 
      _
    ]
  ] = js.undefined
  var visitClassDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitClassExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassExpression, _], 
      _
    ]
  ] = js.undefined
  var visitClassImplements: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassImplements, _], 
      _
    ]
  ] = js.undefined
  var visitClassMethod: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassMethod, _], 
      _
    ]
  ] = js.undefined
  var visitClassPrivateMethod: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassPrivateMethod, _], 
      _
    ]
  ] = js.undefined
  var visitClassPrivateProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassPrivateProperty, _], 
      _
    ]
  ] = js.undefined
  var visitClassProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassProperty, _], 
      _
    ]
  ] = js.undefined
  var visitClassPropertyDefinition: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassPropertyDefinition, _], 
      _
    ]
  ] = js.undefined
  var visitComment: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Comment, _], 
      _
    ]
  ] = js.undefined
  var visitCommentBlock: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.CommentBlock, _], 
      _
    ]
  ] = js.undefined
  var visitCommentLine: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.CommentLine, _], 
      _
    ]
  ] = js.undefined
  var visitComprehensionBlock: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ComprehensionBlock, _], 
      _
    ]
  ] = js.undefined
  var visitComprehensionExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ComprehensionExpression, _], 
      _
    ]
  ] = js.undefined
  var visitConditionalExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ConditionalExpression, _], 
      _
    ]
  ] = js.undefined
  var visitContinueStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ContinueStatement, _], 
      _
    ]
  ] = js.undefined
  var visitDebuggerStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DebuggerStatement, _], 
      _
    ]
  ] = js.undefined
  var visitDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Declaration, _], 
      _
    ]
  ] = js.undefined
  var visitDeclareClass: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareClass, _], 
      _
    ]
  ] = js.undefined
  var visitDeclareExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareExportAllDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitDeclareExportDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareExportDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitDeclareFunction: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareFunction, _], 
      _
    ]
  ] = js.undefined
  var visitDeclareInterface: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareInterface, _], 
      _
    ]
  ] = js.undefined
  var visitDeclareModule: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareModule, _], 
      _
    ]
  ] = js.undefined
  var visitDeclareModuleExports: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareModuleExports, _], 
      _
    ]
  ] = js.undefined
  var visitDeclareOpaqueType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareOpaqueType, _], 
      _
    ]
  ] = js.undefined
  var visitDeclareTypeAlias: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareTypeAlias, _], 
      _
    ]
  ] = js.undefined
  var visitDeclareVariable: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareVariable, _], 
      _
    ]
  ] = js.undefined
  var visitDeclaredPredicate: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclaredPredicate, _], 
      _
    ]
  ] = js.undefined
  var visitDecorator: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Decorator, _], 
      _
    ]
  ] = js.undefined
  var visitDirective: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Directive, _], 
      _
    ]
  ] = js.undefined
  var visitDirectiveLiteral: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DirectiveLiteral, _], 
      _
    ]
  ] = js.undefined
  var visitDoExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DoExpression, _], 
      _
    ]
  ] = js.undefined
  var visitDoWhileStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DoWhileStatement, _], 
      _
    ]
  ] = js.undefined
  var visitEmptyStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.EmptyStatement, _], 
      _
    ]
  ] = js.undefined
  var visitEmptyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.EmptyTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitExistentialTypeParam: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExistentialTypeParam, _], 
      _
    ]
  ] = js.undefined
  var visitExistsTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExistsTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportAllDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitExportBatchSpecifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportBatchSpecifier, _], 
      _
    ]
  ] = js.undefined
  var visitExportDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitExportDefaultDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportDefaultDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitExportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportDefaultSpecifier, _], 
      _
    ]
  ] = js.undefined
  var visitExportNamedDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportNamedDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitExportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportNamespaceSpecifier, _], 
      _
    ]
  ] = js.undefined
  var visitExportSpecifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportSpecifier, _], 
      _
    ]
  ] = js.undefined
  var visitExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Expression, _], 
      _
    ]
  ] = js.undefined
  var visitExpressionStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExpressionStatement, _], 
      _
    ]
  ] = js.undefined
  var visitFile: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.File, _], 
      _
    ]
  ] = js.undefined
  var visitFlow: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Flow, _], 
      _
    ]
  ] = js.undefined
  var visitFlowPredicate: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FlowPredicate, _], 
      _
    ]
  ] = js.undefined
  var visitFlowType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FlowType, _], 
      _
    ]
  ] = js.undefined
  var visitForAwaitStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ForAwaitStatement, _], 
      _
    ]
  ] = js.undefined
  var visitForInStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ForInStatement, _], 
      _
    ]
  ] = js.undefined
  var visitForOfStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ForOfStatement, _], 
      _
    ]
  ] = js.undefined
  var visitForStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ForStatement, _], 
      _
    ]
  ] = js.undefined
  var visitFunction: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Function, _], 
      _
    ]
  ] = js.undefined
  var visitFunctionDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitFunctionExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionExpression, _], 
      _
    ]
  ] = js.undefined
  var visitFunctionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitFunctionTypeParam: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeParam, _], 
      _
    ]
  ] = js.undefined
  var visitGeneratorExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.GeneratorExpression, _], 
      _
    ]
  ] = js.undefined
  var visitGenericTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.GenericTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitIdentifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Identifier, _], 
      _
    ]
  ] = js.undefined
  var visitIfStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.IfStatement, _], 
      _
    ]
  ] = js.undefined
  var visitImport: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Import, _], 
      _
    ]
  ] = js.undefined
  var visitImportDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitImportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportDefaultSpecifier, _], 
      _
    ]
  ] = js.undefined
  var visitImportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportNamespaceSpecifier, _], 
      _
    ]
  ] = js.undefined
  var visitImportSpecifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportSpecifier, _], 
      _
    ]
  ] = js.undefined
  var visitInferredPredicate: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.InferredPredicate, _], 
      _
    ]
  ] = js.undefined
  var visitInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.InterfaceDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitInterfaceExtends: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.InterfaceExtends, _], 
      _
    ]
  ] = js.undefined
  var visitInterfaceTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.InterfaceTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitInterpreterDirective: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.InterpreterDirective, _], 
      _
    ]
  ] = js.undefined
  var visitIntersectionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.IntersectionTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitJSXAttribute: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXAttribute, _], 
      _
    ]
  ] = js.undefined
  var visitJSXClosingElement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXClosingElement, _], 
      _
    ]
  ] = js.undefined
  var visitJSXClosingFragment: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXClosingFragment, _], 
      _
    ]
  ] = js.undefined
  var visitJSXElement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXElement, _], 
      _
    ]
  ] = js.undefined
  var visitJSXEmptyExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXEmptyExpression, _], 
      _
    ]
  ] = js.undefined
  var visitJSXExpressionContainer: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXExpressionContainer, _], 
      _
    ]
  ] = js.undefined
  var visitJSXFragment: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXFragment, _], 
      _
    ]
  ] = js.undefined
  var visitJSXIdentifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXIdentifier, _], 
      _
    ]
  ] = js.undefined
  var visitJSXMemberExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXMemberExpression, _], 
      _
    ]
  ] = js.undefined
  var visitJSXNamespacedName: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXNamespacedName, _], 
      _
    ]
  ] = js.undefined
  var visitJSXOpeningElement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXOpeningElement, _], 
      _
    ]
  ] = js.undefined
  var visitJSXOpeningFragment: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXOpeningFragment, _], 
      _
    ]
  ] = js.undefined
  var visitJSXSpreadAttribute: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXSpreadAttribute, _], 
      _
    ]
  ] = js.undefined
  var visitJSXSpreadChild: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXSpreadChild, _], 
      _
    ]
  ] = js.undefined
  var visitJSXText: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXText, _], 
      _
    ]
  ] = js.undefined
  var visitLabeledStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.LabeledStatement, _], 
      _
    ]
  ] = js.undefined
  var visitLine: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Line, _], 
      _
    ]
  ] = js.undefined
  var visitLiteral: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Literal, _], 
      _
    ]
  ] = js.undefined
  var visitLogicalExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.LogicalExpression, _], 
      _
    ]
  ] = js.undefined
  var visitMemberExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.MemberExpression, _], 
      _
    ]
  ] = js.undefined
  var visitMemberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.MemberTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitMetaProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.MetaProperty, _], 
      _
    ]
  ] = js.undefined
  var visitMethodDefinition: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.MethodDefinition, _], 
      _
    ]
  ] = js.undefined
  var visitMixedTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.MixedTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitModuleSpecifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ModuleSpecifier, _], 
      _
    ]
  ] = js.undefined
  var visitNewExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NewExpression, _], 
      _
    ]
  ] = js.undefined
  var visitNode: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Node, _], 
      _
    ]
  ] = js.undefined
  var visitNoop: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Noop, _], 
      _
    ]
  ] = js.undefined
  var visitNullLiteral: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NullLiteral, _], 
      _
    ]
  ] = js.undefined
  var visitNullLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NullLiteralTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitNullTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NullTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitNullableTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NullableTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitNumberLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NumberLiteralTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitNumberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NumberTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitNumericLiteral: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NumericLiteral, _], 
      _
    ]
  ] = js.undefined
  var visitNumericLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NumericLiteralTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitObjectExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectExpression, _], 
      _
    ]
  ] = js.undefined
  var visitObjectMethod: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectMethod, _], 
      _
    ]
  ] = js.undefined
  var visitObjectPattern: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectPattern, _], 
      _
    ]
  ] = js.undefined
  var visitObjectProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectProperty, _], 
      _
    ]
  ] = js.undefined
  var visitObjectTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitObjectTypeCallProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeCallProperty, _], 
      _
    ]
  ] = js.undefined
  var visitObjectTypeIndexer: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeIndexer, _], 
      _
    ]
  ] = js.undefined
  var visitObjectTypeInternalSlot: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeInternalSlot, _], 
      _
    ]
  ] = js.undefined
  var visitObjectTypeProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeProperty, _], 
      _
    ]
  ] = js.undefined
  var visitObjectTypeSpreadProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeSpreadProperty, _], 
      _
    ]
  ] = js.undefined
  var visitOpaqueType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.OpaqueType, _], 
      _
    ]
  ] = js.undefined
  var visitOptionalCallExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.OptionalCallExpression, _], 
      _
    ]
  ] = js.undefined
  var visitOptionalMemberExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.OptionalMemberExpression, _], 
      _
    ]
  ] = js.undefined
  var visitParenthesizedExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ParenthesizedExpression, _], 
      _
    ]
  ] = js.undefined
  var visitPattern: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Pattern, _], 
      _
    ]
  ] = js.undefined
  var visitPosition: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Position, _], 
      _
    ]
  ] = js.undefined
  var visitPrintable: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Printable, _], 
      _
    ]
  ] = js.undefined
  var visitPrivateName: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.PrivateName, _], 
      _
    ]
  ] = js.undefined
  var visitProgram: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Program, _], 
      _
    ]
  ] = js.undefined
  var visitProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Property, _], 
      _
    ]
  ] = js.undefined
  var visitPropertyPattern: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.PropertyPattern, _], 
      _
    ]
  ] = js.undefined
  var visitQualifiedTypeIdentifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.QualifiedTypeIdentifier, _], 
      _
    ]
  ] = js.undefined
  var visitRegExpLiteral: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.RegExpLiteral, _], 
      _
    ]
  ] = js.undefined
  var visitRestElement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.RestElement, _], 
      _
    ]
  ] = js.undefined
  var visitRestProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.RestProperty, _], 
      _
    ]
  ] = js.undefined
  var visitReturnStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ReturnStatement, _], 
      _
    ]
  ] = js.undefined
  var visitSequenceExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SequenceExpression, _], 
      _
    ]
  ] = js.undefined
  var visitSourceLocation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SourceLocation, _], 
      _
    ]
  ] = js.undefined
  var visitSpecifier: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Specifier, _], 
      _
    ]
  ] = js.undefined
  var visitSpreadElement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadElement, _], 
      _
    ]
  ] = js.undefined
  var visitSpreadElementPattern: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadElementPattern, _], 
      _
    ]
  ] = js.undefined
  var visitSpreadProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadProperty, _], 
      _
    ]
  ] = js.undefined
  var visitSpreadPropertyPattern: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadPropertyPattern, _], 
      _
    ]
  ] = js.undefined
  var visitStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Statement, _], 
      _
    ]
  ] = js.undefined
  var visitStringLiteral: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.StringLiteral, _], 
      _
    ]
  ] = js.undefined
  var visitStringLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.StringLiteralTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitStringTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.StringTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitSuper: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Super, _], 
      _
    ]
  ] = js.undefined
  var visitSwitchCase: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchCase, _], 
      _
    ]
  ] = js.undefined
  var visitSwitchStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchStatement, _], 
      _
    ]
  ] = js.undefined
  var visitTSAnyKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSAnyKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSArrayType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSArrayType, _], 
      _
    ]
  ] = js.undefined
  var visitTSAsExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSAsExpression, _], 
      _
    ]
  ] = js.undefined
  var visitTSBigIntKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSBigIntKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSBooleanKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSBooleanKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSCallSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSCallSignatureDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSConditionalType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSConditionalType, _], 
      _
    ]
  ] = js.undefined
  var visitTSConstructSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSConstructSignatureDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSConstructorType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSConstructorType, _], 
      _
    ]
  ] = js.undefined
  var visitTSDeclareFunction: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSDeclareFunction, _], 
      _
    ]
  ] = js.undefined
  var visitTSDeclareMethod: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSDeclareMethod, _], 
      _
    ]
  ] = js.undefined
  var visitTSEnumDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSEnumDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSEnumMember: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSEnumMember, _], 
      _
    ]
  ] = js.undefined
  var visitTSExportAssignment: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSExportAssignment, _], 
      _
    ]
  ] = js.undefined
  var visitTSExpressionWithTypeArguments: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSExpressionWithTypeArguments, _], 
      _
    ]
  ] = js.undefined
  var visitTSExternalModuleReference: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSExternalModuleReference, _], 
      _
    ]
  ] = js.undefined
  var visitTSFunctionType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSFunctionType, _], 
      _
    ]
  ] = js.undefined
  var visitTSHasOptionalTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSHasOptionalTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitTSHasOptionalTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[
        astDashTypesLib.genNamedTypesMod.namedTypesNs.TSHasOptionalTypeParameterInstantiation, 
        _
      ], 
      _
    ]
  ] = js.undefined
  var visitTSHasOptionalTypeParameters: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSHasOptionalTypeParameters, _], 
      _
    ]
  ] = js.undefined
  var visitTSImportEqualsDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSImportEqualsDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSImportType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSImportType, _], 
      _
    ]
  ] = js.undefined
  var visitTSIndexSignature: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSIndexSignature, _], 
      _
    ]
  ] = js.undefined
  var visitTSIndexedAccessType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSIndexedAccessType, _], 
      _
    ]
  ] = js.undefined
  var visitTSInferType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInferType, _], 
      _
    ]
  ] = js.undefined
  var visitTSInterfaceBody: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInterfaceBody, _], 
      _
    ]
  ] = js.undefined
  var visitTSInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInterfaceDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSIntersectionType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSIntersectionType, _], 
      _
    ]
  ] = js.undefined
  var visitTSLiteralType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSLiteralType, _], 
      _
    ]
  ] = js.undefined
  var visitTSMappedType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSMappedType, _], 
      _
    ]
  ] = js.undefined
  var visitTSMethodSignature: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSMethodSignature, _], 
      _
    ]
  ] = js.undefined
  var visitTSModuleBlock: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSModuleBlock, _], 
      _
    ]
  ] = js.undefined
  var visitTSModuleDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSModuleDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSNamespaceExportDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNamespaceExportDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSNeverKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNeverKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSNonNullExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNonNullExpression, _], 
      _
    ]
  ] = js.undefined
  var visitTSNullKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNullKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSNumberKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNumberKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSObjectKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSObjectKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSOptionalType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSOptionalType, _], 
      _
    ]
  ] = js.undefined
  var visitTSParameterProperty: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSParameterProperty, _], 
      _
    ]
  ] = js.undefined
  var visitTSParenthesizedType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSParenthesizedType, _], 
      _
    ]
  ] = js.undefined
  var visitTSPropertySignature: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSPropertySignature, _], 
      _
    ]
  ] = js.undefined
  var visitTSQualifiedName: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSQualifiedName, _], 
      _
    ]
  ] = js.undefined
  var visitTSRestType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSRestType, _], 
      _
    ]
  ] = js.undefined
  var visitTSStringKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSStringKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSSymbolKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSSymbolKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSThisType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSThisType, _], 
      _
    ]
  ] = js.undefined
  var visitTSTupleType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTupleType, _], 
      _
    ]
  ] = js.undefined
  var visitTSType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSType, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypeAliasDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeAliasDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypeAssertion: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeAssertion, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypeLiteral: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeLiteral, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypeOperator: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeOperator, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypeParameter: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeParameter, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeParameterDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeParameterInstantiation, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypePredicate: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypePredicate, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypeQuery: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeQuery, _], 
      _
    ]
  ] = js.undefined
  var visitTSTypeReference: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeReference, _], 
      _
    ]
  ] = js.undefined
  var visitTSUndefinedKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSUndefinedKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSUnionType: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSUnionType, _], 
      _
    ]
  ] = js.undefined
  var visitTSUnknownKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSUnknownKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTSVoidKeyword: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSVoidKeyword, _], 
      _
    ]
  ] = js.undefined
  var visitTaggedTemplateExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TaggedTemplateExpression, _], 
      _
    ]
  ] = js.undefined
  var visitTemplateElement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TemplateElement, _], 
      _
    ]
  ] = js.undefined
  var visitTemplateLiteral: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TemplateLiteral, _], 
      _
    ]
  ] = js.undefined
  var visitThisExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ThisExpression, _], 
      _
    ]
  ] = js.undefined
  var visitThisTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ThisTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitThrowStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ThrowStatement, _], 
      _
    ]
  ] = js.undefined
  var visitTryStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TryStatement, _], 
      _
    ]
  ] = js.undefined
  var visitTupleTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TupleTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitTypeAlias: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeAlias, _], 
      _
    ]
  ] = js.undefined
  var visitTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitTypeCastExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeCastExpression, _], 
      _
    ]
  ] = js.undefined
  var visitTypeParameter: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeParameter, _], 
      _
    ]
  ] = js.undefined
  var visitTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeParameterDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeParameterInstantiation, _], 
      _
    ]
  ] = js.undefined
  var visitTypeofTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeofTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitUnaryExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.UnaryExpression, _], 
      _
    ]
  ] = js.undefined
  var visitUnionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.UnionTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitUpdateExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.UpdateExpression, _], 
      _
    ]
  ] = js.undefined
  var visitVariableDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.VariableDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitVariableDeclarator: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.VariableDeclarator, _], 
      _
    ]
  ] = js.undefined
  var visitVariance: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Variance, _], 
      _
    ]
  ] = js.undefined
  var visitVoidTypeAnnotation: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.VoidTypeAnnotation, _], 
      _
    ]
  ] = js.undefined
  var visitWhileStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.WhileStatement, _], 
      _
    ]
  ] = js.undefined
  var visitWithStatement: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.WithStatement, _], 
      _
    ]
  ] = js.undefined
  var visitYieldExpression: js.UndefOr[
    js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.YieldExpression, _], 
      _
    ]
  ] = js.undefined
}

object Visitor {
  @scala.inline
  def apply[M](
    visitAnyTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.AnyTypeAnnotation, _], 
      _
    ] = null,
    visitArrayExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrayExpression, _], 
      _
    ] = null,
    visitArrayPattern: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrayPattern, _], 
      _
    ] = null,
    visitArrayTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrayTypeAnnotation, _], 
      _
    ] = null,
    visitArrowFunctionExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrowFunctionExpression, _], 
      _
    ] = null,
    visitAssignmentExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.AssignmentExpression, _], 
      _
    ] = null,
    visitAssignmentPattern: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.AssignmentPattern, _], 
      _
    ] = null,
    visitAwaitExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.AwaitExpression, _], 
      _
    ] = null,
    visitBigIntLiteral: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BigIntLiteral, _], 
      _
    ] = null,
    visitBinaryExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BinaryExpression, _], 
      _
    ] = null,
    visitBindExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BindExpression, _], 
      _
    ] = null,
    visitBlock: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Block, _], 
      _
    ] = null,
    visitBlockStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BlockStatement, _], 
      _
    ] = null,
    visitBooleanLiteral: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BooleanLiteral, _], 
      _
    ] = null,
    visitBooleanLiteralTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BooleanLiteralTypeAnnotation, _], 
      _
    ] = null,
    visitBooleanTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BooleanTypeAnnotation, _], 
      _
    ] = null,
    visitBreakStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.BreakStatement, _], 
      _
    ] = null,
    visitCallExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.CallExpression, _], 
      _
    ] = null,
    visitCatchClause: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.CatchClause, _], 
      _
    ] = null,
    visitClassBody: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassBody, _], 
      _
    ] = null,
    visitClassDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassDeclaration, _], 
      _
    ] = null,
    visitClassExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassExpression, _], 
      _
    ] = null,
    visitClassImplements: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassImplements, _], 
      _
    ] = null,
    visitClassMethod: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassMethod, _], 
      _
    ] = null,
    visitClassPrivateMethod: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassPrivateMethod, _], 
      _
    ] = null,
    visitClassPrivateProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassPrivateProperty, _], 
      _
    ] = null,
    visitClassProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassProperty, _], 
      _
    ] = null,
    visitClassPropertyDefinition: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassPropertyDefinition, _], 
      _
    ] = null,
    visitComment: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Comment, _], 
      _
    ] = null,
    visitCommentBlock: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.CommentBlock, _], 
      _
    ] = null,
    visitCommentLine: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.CommentLine, _], 
      _
    ] = null,
    visitComprehensionBlock: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ComprehensionBlock, _], 
      _
    ] = null,
    visitComprehensionExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ComprehensionExpression, _], 
      _
    ] = null,
    visitConditionalExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ConditionalExpression, _], 
      _
    ] = null,
    visitContinueStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ContinueStatement, _], 
      _
    ] = null,
    visitDebuggerStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DebuggerStatement, _], 
      _
    ] = null,
    visitDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Declaration, _], 
      _
    ] = null,
    visitDeclareClass: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareClass, _], 
      _
    ] = null,
    visitDeclareExportAllDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareExportAllDeclaration, _], 
      _
    ] = null,
    visitDeclareExportDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareExportDeclaration, _], 
      _
    ] = null,
    visitDeclareFunction: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareFunction, _], 
      _
    ] = null,
    visitDeclareInterface: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareInterface, _], 
      _
    ] = null,
    visitDeclareModule: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareModule, _], 
      _
    ] = null,
    visitDeclareModuleExports: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareModuleExports, _], 
      _
    ] = null,
    visitDeclareOpaqueType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareOpaqueType, _], 
      _
    ] = null,
    visitDeclareTypeAlias: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareTypeAlias, _], 
      _
    ] = null,
    visitDeclareVariable: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareVariable, _], 
      _
    ] = null,
    visitDeclaredPredicate: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclaredPredicate, _], 
      _
    ] = null,
    visitDecorator: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Decorator, _], 
      _
    ] = null,
    visitDirective: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Directive, _], 
      _
    ] = null,
    visitDirectiveLiteral: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DirectiveLiteral, _], 
      _
    ] = null,
    visitDoExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DoExpression, _], 
      _
    ] = null,
    visitDoWhileStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.DoWhileStatement, _], 
      _
    ] = null,
    visitEmptyStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.EmptyStatement, _], 
      _
    ] = null,
    visitEmptyTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.EmptyTypeAnnotation, _], 
      _
    ] = null,
    visitExistentialTypeParam: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExistentialTypeParam, _], 
      _
    ] = null,
    visitExistsTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExistsTypeAnnotation, _], 
      _
    ] = null,
    visitExportAllDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportAllDeclaration, _], 
      _
    ] = null,
    visitExportBatchSpecifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportBatchSpecifier, _], 
      _
    ] = null,
    visitExportDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportDeclaration, _], 
      _
    ] = null,
    visitExportDefaultDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportDefaultDeclaration, _], 
      _
    ] = null,
    visitExportDefaultSpecifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportDefaultSpecifier, _], 
      _
    ] = null,
    visitExportNamedDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportNamedDeclaration, _], 
      _
    ] = null,
    visitExportNamespaceSpecifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportNamespaceSpecifier, _], 
      _
    ] = null,
    visitExportSpecifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportSpecifier, _], 
      _
    ] = null,
    visitExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Expression, _], 
      _
    ] = null,
    visitExpressionStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ExpressionStatement, _], 
      _
    ] = null,
    visitFile: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.File, _], 
      _
    ] = null,
    visitFlow: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Flow, _], 
      _
    ] = null,
    visitFlowPredicate: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FlowPredicate, _], 
      _
    ] = null,
    visitFlowType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FlowType, _], 
      _
    ] = null,
    visitForAwaitStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ForAwaitStatement, _], 
      _
    ] = null,
    visitForInStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ForInStatement, _], 
      _
    ] = null,
    visitForOfStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ForOfStatement, _], 
      _
    ] = null,
    visitForStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ForStatement, _], 
      _
    ] = null,
    visitFunction: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Function, _], 
      _
    ] = null,
    visitFunctionDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionDeclaration, _], 
      _
    ] = null,
    visitFunctionExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionExpression, _], 
      _
    ] = null,
    visitFunctionTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeAnnotation, _], 
      _
    ] = null,
    visitFunctionTypeParam: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeParam, _], 
      _
    ] = null,
    visitGeneratorExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.GeneratorExpression, _], 
      _
    ] = null,
    visitGenericTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.GenericTypeAnnotation, _], 
      _
    ] = null,
    visitIdentifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Identifier, _], 
      _
    ] = null,
    visitIfStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.IfStatement, _], 
      _
    ] = null,
    visitImport: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Import, _], 
      _
    ] = null,
    visitImportDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportDeclaration, _], 
      _
    ] = null,
    visitImportDefaultSpecifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportDefaultSpecifier, _], 
      _
    ] = null,
    visitImportNamespaceSpecifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportNamespaceSpecifier, _], 
      _
    ] = null,
    visitImportSpecifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportSpecifier, _], 
      _
    ] = null,
    visitInferredPredicate: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.InferredPredicate, _], 
      _
    ] = null,
    visitInterfaceDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.InterfaceDeclaration, _], 
      _
    ] = null,
    visitInterfaceExtends: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.InterfaceExtends, _], 
      _
    ] = null,
    visitInterfaceTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.InterfaceTypeAnnotation, _], 
      _
    ] = null,
    visitInterpreterDirective: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.InterpreterDirective, _], 
      _
    ] = null,
    visitIntersectionTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.IntersectionTypeAnnotation, _], 
      _
    ] = null,
    visitJSXAttribute: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXAttribute, _], 
      _
    ] = null,
    visitJSXClosingElement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXClosingElement, _], 
      _
    ] = null,
    visitJSXClosingFragment: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXClosingFragment, _], 
      _
    ] = null,
    visitJSXElement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXElement, _], 
      _
    ] = null,
    visitJSXEmptyExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXEmptyExpression, _], 
      _
    ] = null,
    visitJSXExpressionContainer: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXExpressionContainer, _], 
      _
    ] = null,
    visitJSXFragment: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXFragment, _], 
      _
    ] = null,
    visitJSXIdentifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXIdentifier, _], 
      _
    ] = null,
    visitJSXMemberExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXMemberExpression, _], 
      _
    ] = null,
    visitJSXNamespacedName: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXNamespacedName, _], 
      _
    ] = null,
    visitJSXOpeningElement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXOpeningElement, _], 
      _
    ] = null,
    visitJSXOpeningFragment: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXOpeningFragment, _], 
      _
    ] = null,
    visitJSXSpreadAttribute: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXSpreadAttribute, _], 
      _
    ] = null,
    visitJSXSpreadChild: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXSpreadChild, _], 
      _
    ] = null,
    visitJSXText: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXText, _], 
      _
    ] = null,
    visitLabeledStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.LabeledStatement, _], 
      _
    ] = null,
    visitLine: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Line, _], 
      _
    ] = null,
    visitLiteral: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Literal, _], 
      _
    ] = null,
    visitLogicalExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.LogicalExpression, _], 
      _
    ] = null,
    visitMemberExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.MemberExpression, _], 
      _
    ] = null,
    visitMemberTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.MemberTypeAnnotation, _], 
      _
    ] = null,
    visitMetaProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.MetaProperty, _], 
      _
    ] = null,
    visitMethodDefinition: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.MethodDefinition, _], 
      _
    ] = null,
    visitMixedTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.MixedTypeAnnotation, _], 
      _
    ] = null,
    visitModuleSpecifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ModuleSpecifier, _], 
      _
    ] = null,
    visitNewExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NewExpression, _], 
      _
    ] = null,
    visitNode: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Node, _], 
      _
    ] = null,
    visitNoop: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Noop, _], 
      _
    ] = null,
    visitNullLiteral: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NullLiteral, _], 
      _
    ] = null,
    visitNullLiteralTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NullLiteralTypeAnnotation, _], 
      _
    ] = null,
    visitNullTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NullTypeAnnotation, _], 
      _
    ] = null,
    visitNullableTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NullableTypeAnnotation, _], 
      _
    ] = null,
    visitNumberLiteralTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NumberLiteralTypeAnnotation, _], 
      _
    ] = null,
    visitNumberTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NumberTypeAnnotation, _], 
      _
    ] = null,
    visitNumericLiteral: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NumericLiteral, _], 
      _
    ] = null,
    visitNumericLiteralTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.NumericLiteralTypeAnnotation, _], 
      _
    ] = null,
    visitObjectExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectExpression, _], 
      _
    ] = null,
    visitObjectMethod: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectMethod, _], 
      _
    ] = null,
    visitObjectPattern: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectPattern, _], 
      _
    ] = null,
    visitObjectProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectProperty, _], 
      _
    ] = null,
    visitObjectTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeAnnotation, _], 
      _
    ] = null,
    visitObjectTypeCallProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeCallProperty, _], 
      _
    ] = null,
    visitObjectTypeIndexer: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeIndexer, _], 
      _
    ] = null,
    visitObjectTypeInternalSlot: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeInternalSlot, _], 
      _
    ] = null,
    visitObjectTypeProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeProperty, _], 
      _
    ] = null,
    visitObjectTypeSpreadProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeSpreadProperty, _], 
      _
    ] = null,
    visitOpaqueType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.OpaqueType, _], 
      _
    ] = null,
    visitOptionalCallExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.OptionalCallExpression, _], 
      _
    ] = null,
    visitOptionalMemberExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.OptionalMemberExpression, _], 
      _
    ] = null,
    visitParenthesizedExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ParenthesizedExpression, _], 
      _
    ] = null,
    visitPattern: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Pattern, _], 
      _
    ] = null,
    visitPosition: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Position, _], 
      _
    ] = null,
    visitPrintable: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Printable, _], 
      _
    ] = null,
    visitPrivateName: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.PrivateName, _], 
      _
    ] = null,
    visitProgram: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Program, _], 
      _
    ] = null,
    visitProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Property, _], 
      _
    ] = null,
    visitPropertyPattern: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.PropertyPattern, _], 
      _
    ] = null,
    visitQualifiedTypeIdentifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.QualifiedTypeIdentifier, _], 
      _
    ] = null,
    visitRegExpLiteral: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.RegExpLiteral, _], 
      _
    ] = null,
    visitRestElement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.RestElement, _], 
      _
    ] = null,
    visitRestProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.RestProperty, _], 
      _
    ] = null,
    visitReturnStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ReturnStatement, _], 
      _
    ] = null,
    visitSequenceExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SequenceExpression, _], 
      _
    ] = null,
    visitSourceLocation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SourceLocation, _], 
      _
    ] = null,
    visitSpecifier: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Specifier, _], 
      _
    ] = null,
    visitSpreadElement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadElement, _], 
      _
    ] = null,
    visitSpreadElementPattern: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadElementPattern, _], 
      _
    ] = null,
    visitSpreadProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadProperty, _], 
      _
    ] = null,
    visitSpreadPropertyPattern: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadPropertyPattern, _], 
      _
    ] = null,
    visitStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Statement, _], 
      _
    ] = null,
    visitStringLiteral: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.StringLiteral, _], 
      _
    ] = null,
    visitStringLiteralTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.StringLiteralTypeAnnotation, _], 
      _
    ] = null,
    visitStringTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.StringTypeAnnotation, _], 
      _
    ] = null,
    visitSuper: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.Super, _], 
      _
    ] = null,
    visitSwitchCase: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchCase, _], 
      _
    ] = null,
    visitSwitchStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchStatement, _], 
      _
    ] = null,
    visitTSAnyKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSAnyKeyword, _], 
      _
    ] = null,
    visitTSArrayType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSArrayType, _], 
      _
    ] = null,
    visitTSAsExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSAsExpression, _], 
      _
    ] = null,
    visitTSBigIntKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSBigIntKeyword, _], 
      _
    ] = null,
    visitTSBooleanKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSBooleanKeyword, _], 
      _
    ] = null,
    visitTSCallSignatureDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSCallSignatureDeclaration, _], 
      _
    ] = null,
    visitTSConditionalType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSConditionalType, _], 
      _
    ] = null,
    visitTSConstructSignatureDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSConstructSignatureDeclaration, _], 
      _
    ] = null,
    visitTSConstructorType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSConstructorType, _], 
      _
    ] = null,
    visitTSDeclareFunction: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSDeclareFunction, _], 
      _
    ] = null,
    visitTSDeclareMethod: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSDeclareMethod, _], 
      _
    ] = null,
    visitTSEnumDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSEnumDeclaration, _], 
      _
    ] = null,
    visitTSEnumMember: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSEnumMember, _], 
      _
    ] = null,
    visitTSExportAssignment: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSExportAssignment, _], 
      _
    ] = null,
    visitTSExpressionWithTypeArguments: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSExpressionWithTypeArguments, _], 
      _
    ] = null,
    visitTSExternalModuleReference: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSExternalModuleReference, _], 
      _
    ] = null,
    visitTSFunctionType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSFunctionType, _], 
      _
    ] = null,
    visitTSHasOptionalTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSHasOptionalTypeAnnotation, _], 
      _
    ] = null,
    visitTSHasOptionalTypeParameterInstantiation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[
        astDashTypesLib.genNamedTypesMod.namedTypesNs.TSHasOptionalTypeParameterInstantiation, 
        _
      ], 
      _
    ] = null,
    visitTSHasOptionalTypeParameters: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSHasOptionalTypeParameters, _], 
      _
    ] = null,
    visitTSImportEqualsDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSImportEqualsDeclaration, _], 
      _
    ] = null,
    visitTSImportType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSImportType, _], 
      _
    ] = null,
    visitTSIndexSignature: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSIndexSignature, _], 
      _
    ] = null,
    visitTSIndexedAccessType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSIndexedAccessType, _], 
      _
    ] = null,
    visitTSInferType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInferType, _], 
      _
    ] = null,
    visitTSInterfaceBody: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInterfaceBody, _], 
      _
    ] = null,
    visitTSInterfaceDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInterfaceDeclaration, _], 
      _
    ] = null,
    visitTSIntersectionType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSIntersectionType, _], 
      _
    ] = null,
    visitTSLiteralType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSLiteralType, _], 
      _
    ] = null,
    visitTSMappedType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSMappedType, _], 
      _
    ] = null,
    visitTSMethodSignature: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSMethodSignature, _], 
      _
    ] = null,
    visitTSModuleBlock: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSModuleBlock, _], 
      _
    ] = null,
    visitTSModuleDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSModuleDeclaration, _], 
      _
    ] = null,
    visitTSNamespaceExportDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNamespaceExportDeclaration, _], 
      _
    ] = null,
    visitTSNeverKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNeverKeyword, _], 
      _
    ] = null,
    visitTSNonNullExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNonNullExpression, _], 
      _
    ] = null,
    visitTSNullKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNullKeyword, _], 
      _
    ] = null,
    visitTSNumberKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNumberKeyword, _], 
      _
    ] = null,
    visitTSObjectKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSObjectKeyword, _], 
      _
    ] = null,
    visitTSOptionalType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSOptionalType, _], 
      _
    ] = null,
    visitTSParameterProperty: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSParameterProperty, _], 
      _
    ] = null,
    visitTSParenthesizedType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSParenthesizedType, _], 
      _
    ] = null,
    visitTSPropertySignature: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSPropertySignature, _], 
      _
    ] = null,
    visitTSQualifiedName: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSQualifiedName, _], 
      _
    ] = null,
    visitTSRestType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSRestType, _], 
      _
    ] = null,
    visitTSStringKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSStringKeyword, _], 
      _
    ] = null,
    visitTSSymbolKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSSymbolKeyword, _], 
      _
    ] = null,
    visitTSThisType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSThisType, _], 
      _
    ] = null,
    visitTSTupleType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTupleType, _], 
      _
    ] = null,
    visitTSType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSType, _], 
      _
    ] = null,
    visitTSTypeAliasDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeAliasDeclaration, _], 
      _
    ] = null,
    visitTSTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeAnnotation, _], 
      _
    ] = null,
    visitTSTypeAssertion: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeAssertion, _], 
      _
    ] = null,
    visitTSTypeLiteral: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeLiteral, _], 
      _
    ] = null,
    visitTSTypeOperator: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeOperator, _], 
      _
    ] = null,
    visitTSTypeParameter: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeParameter, _], 
      _
    ] = null,
    visitTSTypeParameterDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeParameterDeclaration, _], 
      _
    ] = null,
    visitTSTypeParameterInstantiation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeParameterInstantiation, _], 
      _
    ] = null,
    visitTSTypePredicate: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypePredicate, _], 
      _
    ] = null,
    visitTSTypeQuery: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeQuery, _], 
      _
    ] = null,
    visitTSTypeReference: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeReference, _], 
      _
    ] = null,
    visitTSUndefinedKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSUndefinedKeyword, _], 
      _
    ] = null,
    visitTSUnionType: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSUnionType, _], 
      _
    ] = null,
    visitTSUnknownKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSUnknownKeyword, _], 
      _
    ] = null,
    visitTSVoidKeyword: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TSVoidKeyword, _], 
      _
    ] = null,
    visitTaggedTemplateExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TaggedTemplateExpression, _], 
      _
    ] = null,
    visitTemplateElement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TemplateElement, _], 
      _
    ] = null,
    visitTemplateLiteral: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TemplateLiteral, _], 
      _
    ] = null,
    visitThisExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ThisExpression, _], 
      _
    ] = null,
    visitThisTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ThisTypeAnnotation, _], 
      _
    ] = null,
    visitThrowStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.ThrowStatement, _], 
      _
    ] = null,
    visitTryStatement: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TryStatement, _], 
      _
    ] = null,
    visitTupleTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TupleTypeAnnotation, _], 
      _
    ] = null,
    visitTypeAlias: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeAlias, _], 
      _
    ] = null,
    visitTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeAnnotation, _], 
      _
    ] = null,
    visitTypeCastExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeCastExpression, _], 
      _
    ] = null,
    visitTypeParameter: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeParameter, _], 
      _
    ] = null,
    visitTypeParameterDeclaration: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeParameterDeclaration, _], 
      _
    ] = null,
    visitTypeParameterInstantiation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeParameterInstantiation, _], 
      _
    ] = null,
    visitTypeofTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeofTypeAnnotation, _], 
      _
    ] = null,
    visitUnaryExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.UnaryExpression, _], 
      _
    ] = null,
    visitUnionTypeAnnotation: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.UnionTypeAnnotation, _], 
      _
    ] = null,
    visitUpdateExpression: js.ThisFunction1[
      /* this */ astDashTypesLib.libPathDashVisitorMod.Context with M, 
      /* path */ astDashTypesLib.libNodeDashPathMod.NodePath[astDashTypesLib.genNamedTypesMod.namedTypesNs.UpdateExpression, _], 
      _
    ] = null
  ): Visitor[M] = {
    val __obj = js.Dynamic.literal()
    if (visitAnyTypeAnnotation != null) __obj.updateDynamic("visitAnyTypeAnnotation")(visitAnyTypeAnnotation)
    if (visitArrayExpression != null) __obj.updateDynamic("visitArrayExpression")(visitArrayExpression)
    if (visitArrayPattern != null) __obj.updateDynamic("visitArrayPattern")(visitArrayPattern)
    if (visitArrayTypeAnnotation != null) __obj.updateDynamic("visitArrayTypeAnnotation")(visitArrayTypeAnnotation)
    if (visitArrowFunctionExpression != null) __obj.updateDynamic("visitArrowFunctionExpression")(visitArrowFunctionExpression)
    if (visitAssignmentExpression != null) __obj.updateDynamic("visitAssignmentExpression")(visitAssignmentExpression)
    if (visitAssignmentPattern != null) __obj.updateDynamic("visitAssignmentPattern")(visitAssignmentPattern)
    if (visitAwaitExpression != null) __obj.updateDynamic("visitAwaitExpression")(visitAwaitExpression)
    if (visitBigIntLiteral != null) __obj.updateDynamic("visitBigIntLiteral")(visitBigIntLiteral)
    if (visitBinaryExpression != null) __obj.updateDynamic("visitBinaryExpression")(visitBinaryExpression)
    if (visitBindExpression != null) __obj.updateDynamic("visitBindExpression")(visitBindExpression)
    if (visitBlock != null) __obj.updateDynamic("visitBlock")(visitBlock)
    if (visitBlockStatement != null) __obj.updateDynamic("visitBlockStatement")(visitBlockStatement)
    if (visitBooleanLiteral != null) __obj.updateDynamic("visitBooleanLiteral")(visitBooleanLiteral)
    if (visitBooleanLiteralTypeAnnotation != null) __obj.updateDynamic("visitBooleanLiteralTypeAnnotation")(visitBooleanLiteralTypeAnnotation)
    if (visitBooleanTypeAnnotation != null) __obj.updateDynamic("visitBooleanTypeAnnotation")(visitBooleanTypeAnnotation)
    if (visitBreakStatement != null) __obj.updateDynamic("visitBreakStatement")(visitBreakStatement)
    if (visitCallExpression != null) __obj.updateDynamic("visitCallExpression")(visitCallExpression)
    if (visitCatchClause != null) __obj.updateDynamic("visitCatchClause")(visitCatchClause)
    if (visitClassBody != null) __obj.updateDynamic("visitClassBody")(visitClassBody)
    if (visitClassDeclaration != null) __obj.updateDynamic("visitClassDeclaration")(visitClassDeclaration)
    if (visitClassExpression != null) __obj.updateDynamic("visitClassExpression")(visitClassExpression)
    if (visitClassImplements != null) __obj.updateDynamic("visitClassImplements")(visitClassImplements)
    if (visitClassMethod != null) __obj.updateDynamic("visitClassMethod")(visitClassMethod)
    if (visitClassPrivateMethod != null) __obj.updateDynamic("visitClassPrivateMethod")(visitClassPrivateMethod)
    if (visitClassPrivateProperty != null) __obj.updateDynamic("visitClassPrivateProperty")(visitClassPrivateProperty)
    if (visitClassProperty != null) __obj.updateDynamic("visitClassProperty")(visitClassProperty)
    if (visitClassPropertyDefinition != null) __obj.updateDynamic("visitClassPropertyDefinition")(visitClassPropertyDefinition)
    if (visitComment != null) __obj.updateDynamic("visitComment")(visitComment)
    if (visitCommentBlock != null) __obj.updateDynamic("visitCommentBlock")(visitCommentBlock)
    if (visitCommentLine != null) __obj.updateDynamic("visitCommentLine")(visitCommentLine)
    if (visitComprehensionBlock != null) __obj.updateDynamic("visitComprehensionBlock")(visitComprehensionBlock)
    if (visitComprehensionExpression != null) __obj.updateDynamic("visitComprehensionExpression")(visitComprehensionExpression)
    if (visitConditionalExpression != null) __obj.updateDynamic("visitConditionalExpression")(visitConditionalExpression)
    if (visitContinueStatement != null) __obj.updateDynamic("visitContinueStatement")(visitContinueStatement)
    if (visitDebuggerStatement != null) __obj.updateDynamic("visitDebuggerStatement")(visitDebuggerStatement)
    if (visitDeclaration != null) __obj.updateDynamic("visitDeclaration")(visitDeclaration)
    if (visitDeclareClass != null) __obj.updateDynamic("visitDeclareClass")(visitDeclareClass)
    if (visitDeclareExportAllDeclaration != null) __obj.updateDynamic("visitDeclareExportAllDeclaration")(visitDeclareExportAllDeclaration)
    if (visitDeclareExportDeclaration != null) __obj.updateDynamic("visitDeclareExportDeclaration")(visitDeclareExportDeclaration)
    if (visitDeclareFunction != null) __obj.updateDynamic("visitDeclareFunction")(visitDeclareFunction)
    if (visitDeclareInterface != null) __obj.updateDynamic("visitDeclareInterface")(visitDeclareInterface)
    if (visitDeclareModule != null) __obj.updateDynamic("visitDeclareModule")(visitDeclareModule)
    if (visitDeclareModuleExports != null) __obj.updateDynamic("visitDeclareModuleExports")(visitDeclareModuleExports)
    if (visitDeclareOpaqueType != null) __obj.updateDynamic("visitDeclareOpaqueType")(visitDeclareOpaqueType)
    if (visitDeclareTypeAlias != null) __obj.updateDynamic("visitDeclareTypeAlias")(visitDeclareTypeAlias)
    if (visitDeclareVariable != null) __obj.updateDynamic("visitDeclareVariable")(visitDeclareVariable)
    if (visitDeclaredPredicate != null) __obj.updateDynamic("visitDeclaredPredicate")(visitDeclaredPredicate)
    if (visitDecorator != null) __obj.updateDynamic("visitDecorator")(visitDecorator)
    if (visitDirective != null) __obj.updateDynamic("visitDirective")(visitDirective)
    if (visitDirectiveLiteral != null) __obj.updateDynamic("visitDirectiveLiteral")(visitDirectiveLiteral)
    if (visitDoExpression != null) __obj.updateDynamic("visitDoExpression")(visitDoExpression)
    if (visitDoWhileStatement != null) __obj.updateDynamic("visitDoWhileStatement")(visitDoWhileStatement)
    if (visitEmptyStatement != null) __obj.updateDynamic("visitEmptyStatement")(visitEmptyStatement)
    if (visitEmptyTypeAnnotation != null) __obj.updateDynamic("visitEmptyTypeAnnotation")(visitEmptyTypeAnnotation)
    if (visitExistentialTypeParam != null) __obj.updateDynamic("visitExistentialTypeParam")(visitExistentialTypeParam)
    if (visitExistsTypeAnnotation != null) __obj.updateDynamic("visitExistsTypeAnnotation")(visitExistsTypeAnnotation)
    if (visitExportAllDeclaration != null) __obj.updateDynamic("visitExportAllDeclaration")(visitExportAllDeclaration)
    if (visitExportBatchSpecifier != null) __obj.updateDynamic("visitExportBatchSpecifier")(visitExportBatchSpecifier)
    if (visitExportDeclaration != null) __obj.updateDynamic("visitExportDeclaration")(visitExportDeclaration)
    if (visitExportDefaultDeclaration != null) __obj.updateDynamic("visitExportDefaultDeclaration")(visitExportDefaultDeclaration)
    if (visitExportDefaultSpecifier != null) __obj.updateDynamic("visitExportDefaultSpecifier")(visitExportDefaultSpecifier)
    if (visitExportNamedDeclaration != null) __obj.updateDynamic("visitExportNamedDeclaration")(visitExportNamedDeclaration)
    if (visitExportNamespaceSpecifier != null) __obj.updateDynamic("visitExportNamespaceSpecifier")(visitExportNamespaceSpecifier)
    if (visitExportSpecifier != null) __obj.updateDynamic("visitExportSpecifier")(visitExportSpecifier)
    if (visitExpression != null) __obj.updateDynamic("visitExpression")(visitExpression)
    if (visitExpressionStatement != null) __obj.updateDynamic("visitExpressionStatement")(visitExpressionStatement)
    if (visitFile != null) __obj.updateDynamic("visitFile")(visitFile)
    if (visitFlow != null) __obj.updateDynamic("visitFlow")(visitFlow)
    if (visitFlowPredicate != null) __obj.updateDynamic("visitFlowPredicate")(visitFlowPredicate)
    if (visitFlowType != null) __obj.updateDynamic("visitFlowType")(visitFlowType)
    if (visitForAwaitStatement != null) __obj.updateDynamic("visitForAwaitStatement")(visitForAwaitStatement)
    if (visitForInStatement != null) __obj.updateDynamic("visitForInStatement")(visitForInStatement)
    if (visitForOfStatement != null) __obj.updateDynamic("visitForOfStatement")(visitForOfStatement)
    if (visitForStatement != null) __obj.updateDynamic("visitForStatement")(visitForStatement)
    if (visitFunction != null) __obj.updateDynamic("visitFunction")(visitFunction)
    if (visitFunctionDeclaration != null) __obj.updateDynamic("visitFunctionDeclaration")(visitFunctionDeclaration)
    if (visitFunctionExpression != null) __obj.updateDynamic("visitFunctionExpression")(visitFunctionExpression)
    if (visitFunctionTypeAnnotation != null) __obj.updateDynamic("visitFunctionTypeAnnotation")(visitFunctionTypeAnnotation)
    if (visitFunctionTypeParam != null) __obj.updateDynamic("visitFunctionTypeParam")(visitFunctionTypeParam)
    if (visitGeneratorExpression != null) __obj.updateDynamic("visitGeneratorExpression")(visitGeneratorExpression)
    if (visitGenericTypeAnnotation != null) __obj.updateDynamic("visitGenericTypeAnnotation")(visitGenericTypeAnnotation)
    if (visitIdentifier != null) __obj.updateDynamic("visitIdentifier")(visitIdentifier)
    if (visitIfStatement != null) __obj.updateDynamic("visitIfStatement")(visitIfStatement)
    if (visitImport != null) __obj.updateDynamic("visitImport")(visitImport)
    if (visitImportDeclaration != null) __obj.updateDynamic("visitImportDeclaration")(visitImportDeclaration)
    if (visitImportDefaultSpecifier != null) __obj.updateDynamic("visitImportDefaultSpecifier")(visitImportDefaultSpecifier)
    if (visitImportNamespaceSpecifier != null) __obj.updateDynamic("visitImportNamespaceSpecifier")(visitImportNamespaceSpecifier)
    if (visitImportSpecifier != null) __obj.updateDynamic("visitImportSpecifier")(visitImportSpecifier)
    if (visitInferredPredicate != null) __obj.updateDynamic("visitInferredPredicate")(visitInferredPredicate)
    if (visitInterfaceDeclaration != null) __obj.updateDynamic("visitInterfaceDeclaration")(visitInterfaceDeclaration)
    if (visitInterfaceExtends != null) __obj.updateDynamic("visitInterfaceExtends")(visitInterfaceExtends)
    if (visitInterfaceTypeAnnotation != null) __obj.updateDynamic("visitInterfaceTypeAnnotation")(visitInterfaceTypeAnnotation)
    if (visitInterpreterDirective != null) __obj.updateDynamic("visitInterpreterDirective")(visitInterpreterDirective)
    if (visitIntersectionTypeAnnotation != null) __obj.updateDynamic("visitIntersectionTypeAnnotation")(visitIntersectionTypeAnnotation)
    if (visitJSXAttribute != null) __obj.updateDynamic("visitJSXAttribute")(visitJSXAttribute)
    if (visitJSXClosingElement != null) __obj.updateDynamic("visitJSXClosingElement")(visitJSXClosingElement)
    if (visitJSXClosingFragment != null) __obj.updateDynamic("visitJSXClosingFragment")(visitJSXClosingFragment)
    if (visitJSXElement != null) __obj.updateDynamic("visitJSXElement")(visitJSXElement)
    if (visitJSXEmptyExpression != null) __obj.updateDynamic("visitJSXEmptyExpression")(visitJSXEmptyExpression)
    if (visitJSXExpressionContainer != null) __obj.updateDynamic("visitJSXExpressionContainer")(visitJSXExpressionContainer)
    if (visitJSXFragment != null) __obj.updateDynamic("visitJSXFragment")(visitJSXFragment)
    if (visitJSXIdentifier != null) __obj.updateDynamic("visitJSXIdentifier")(visitJSXIdentifier)
    if (visitJSXMemberExpression != null) __obj.updateDynamic("visitJSXMemberExpression")(visitJSXMemberExpression)
    if (visitJSXNamespacedName != null) __obj.updateDynamic("visitJSXNamespacedName")(visitJSXNamespacedName)
    if (visitJSXOpeningElement != null) __obj.updateDynamic("visitJSXOpeningElement")(visitJSXOpeningElement)
    if (visitJSXOpeningFragment != null) __obj.updateDynamic("visitJSXOpeningFragment")(visitJSXOpeningFragment)
    if (visitJSXSpreadAttribute != null) __obj.updateDynamic("visitJSXSpreadAttribute")(visitJSXSpreadAttribute)
    if (visitJSXSpreadChild != null) __obj.updateDynamic("visitJSXSpreadChild")(visitJSXSpreadChild)
    if (visitJSXText != null) __obj.updateDynamic("visitJSXText")(visitJSXText)
    if (visitLabeledStatement != null) __obj.updateDynamic("visitLabeledStatement")(visitLabeledStatement)
    if (visitLine != null) __obj.updateDynamic("visitLine")(visitLine)
    if (visitLiteral != null) __obj.updateDynamic("visitLiteral")(visitLiteral)
    if (visitLogicalExpression != null) __obj.updateDynamic("visitLogicalExpression")(visitLogicalExpression)
    if (visitMemberExpression != null) __obj.updateDynamic("visitMemberExpression")(visitMemberExpression)
    if (visitMemberTypeAnnotation != null) __obj.updateDynamic("visitMemberTypeAnnotation")(visitMemberTypeAnnotation)
    if (visitMetaProperty != null) __obj.updateDynamic("visitMetaProperty")(visitMetaProperty)
    if (visitMethodDefinition != null) __obj.updateDynamic("visitMethodDefinition")(visitMethodDefinition)
    if (visitMixedTypeAnnotation != null) __obj.updateDynamic("visitMixedTypeAnnotation")(visitMixedTypeAnnotation)
    if (visitModuleSpecifier != null) __obj.updateDynamic("visitModuleSpecifier")(visitModuleSpecifier)
    if (visitNewExpression != null) __obj.updateDynamic("visitNewExpression")(visitNewExpression)
    if (visitNode != null) __obj.updateDynamic("visitNode")(visitNode)
    if (visitNoop != null) __obj.updateDynamic("visitNoop")(visitNoop)
    if (visitNullLiteral != null) __obj.updateDynamic("visitNullLiteral")(visitNullLiteral)
    if (visitNullLiteralTypeAnnotation != null) __obj.updateDynamic("visitNullLiteralTypeAnnotation")(visitNullLiteralTypeAnnotation)
    if (visitNullTypeAnnotation != null) __obj.updateDynamic("visitNullTypeAnnotation")(visitNullTypeAnnotation)
    if (visitNullableTypeAnnotation != null) __obj.updateDynamic("visitNullableTypeAnnotation")(visitNullableTypeAnnotation)
    if (visitNumberLiteralTypeAnnotation != null) __obj.updateDynamic("visitNumberLiteralTypeAnnotation")(visitNumberLiteralTypeAnnotation)
    if (visitNumberTypeAnnotation != null) __obj.updateDynamic("visitNumberTypeAnnotation")(visitNumberTypeAnnotation)
    if (visitNumericLiteral != null) __obj.updateDynamic("visitNumericLiteral")(visitNumericLiteral)
    if (visitNumericLiteralTypeAnnotation != null) __obj.updateDynamic("visitNumericLiteralTypeAnnotation")(visitNumericLiteralTypeAnnotation)
    if (visitObjectExpression != null) __obj.updateDynamic("visitObjectExpression")(visitObjectExpression)
    if (visitObjectMethod != null) __obj.updateDynamic("visitObjectMethod")(visitObjectMethod)
    if (visitObjectPattern != null) __obj.updateDynamic("visitObjectPattern")(visitObjectPattern)
    if (visitObjectProperty != null) __obj.updateDynamic("visitObjectProperty")(visitObjectProperty)
    if (visitObjectTypeAnnotation != null) __obj.updateDynamic("visitObjectTypeAnnotation")(visitObjectTypeAnnotation)
    if (visitObjectTypeCallProperty != null) __obj.updateDynamic("visitObjectTypeCallProperty")(visitObjectTypeCallProperty)
    if (visitObjectTypeIndexer != null) __obj.updateDynamic("visitObjectTypeIndexer")(visitObjectTypeIndexer)
    if (visitObjectTypeInternalSlot != null) __obj.updateDynamic("visitObjectTypeInternalSlot")(visitObjectTypeInternalSlot)
    if (visitObjectTypeProperty != null) __obj.updateDynamic("visitObjectTypeProperty")(visitObjectTypeProperty)
    if (visitObjectTypeSpreadProperty != null) __obj.updateDynamic("visitObjectTypeSpreadProperty")(visitObjectTypeSpreadProperty)
    if (visitOpaqueType != null) __obj.updateDynamic("visitOpaqueType")(visitOpaqueType)
    if (visitOptionalCallExpression != null) __obj.updateDynamic("visitOptionalCallExpression")(visitOptionalCallExpression)
    if (visitOptionalMemberExpression != null) __obj.updateDynamic("visitOptionalMemberExpression")(visitOptionalMemberExpression)
    if (visitParenthesizedExpression != null) __obj.updateDynamic("visitParenthesizedExpression")(visitParenthesizedExpression)
    if (visitPattern != null) __obj.updateDynamic("visitPattern")(visitPattern)
    if (visitPosition != null) __obj.updateDynamic("visitPosition")(visitPosition)
    if (visitPrintable != null) __obj.updateDynamic("visitPrintable")(visitPrintable)
    if (visitPrivateName != null) __obj.updateDynamic("visitPrivateName")(visitPrivateName)
    if (visitProgram != null) __obj.updateDynamic("visitProgram")(visitProgram)
    if (visitProperty != null) __obj.updateDynamic("visitProperty")(visitProperty)
    if (visitPropertyPattern != null) __obj.updateDynamic("visitPropertyPattern")(visitPropertyPattern)
    if (visitQualifiedTypeIdentifier != null) __obj.updateDynamic("visitQualifiedTypeIdentifier")(visitQualifiedTypeIdentifier)
    if (visitRegExpLiteral != null) __obj.updateDynamic("visitRegExpLiteral")(visitRegExpLiteral)
    if (visitRestElement != null) __obj.updateDynamic("visitRestElement")(visitRestElement)
    if (visitRestProperty != null) __obj.updateDynamic("visitRestProperty")(visitRestProperty)
    if (visitReturnStatement != null) __obj.updateDynamic("visitReturnStatement")(visitReturnStatement)
    if (visitSequenceExpression != null) __obj.updateDynamic("visitSequenceExpression")(visitSequenceExpression)
    if (visitSourceLocation != null) __obj.updateDynamic("visitSourceLocation")(visitSourceLocation)
    if (visitSpecifier != null) __obj.updateDynamic("visitSpecifier")(visitSpecifier)
    if (visitSpreadElement != null) __obj.updateDynamic("visitSpreadElement")(visitSpreadElement)
    if (visitSpreadElementPattern != null) __obj.updateDynamic("visitSpreadElementPattern")(visitSpreadElementPattern)
    if (visitSpreadProperty != null) __obj.updateDynamic("visitSpreadProperty")(visitSpreadProperty)
    if (visitSpreadPropertyPattern != null) __obj.updateDynamic("visitSpreadPropertyPattern")(visitSpreadPropertyPattern)
    if (visitStatement != null) __obj.updateDynamic("visitStatement")(visitStatement)
    if (visitStringLiteral != null) __obj.updateDynamic("visitStringLiteral")(visitStringLiteral)
    if (visitStringLiteralTypeAnnotation != null) __obj.updateDynamic("visitStringLiteralTypeAnnotation")(visitStringLiteralTypeAnnotation)
    if (visitStringTypeAnnotation != null) __obj.updateDynamic("visitStringTypeAnnotation")(visitStringTypeAnnotation)
    if (visitSuper != null) __obj.updateDynamic("visitSuper")(visitSuper)
    if (visitSwitchCase != null) __obj.updateDynamic("visitSwitchCase")(visitSwitchCase)
    if (visitSwitchStatement != null) __obj.updateDynamic("visitSwitchStatement")(visitSwitchStatement)
    if (visitTSAnyKeyword != null) __obj.updateDynamic("visitTSAnyKeyword")(visitTSAnyKeyword)
    if (visitTSArrayType != null) __obj.updateDynamic("visitTSArrayType")(visitTSArrayType)
    if (visitTSAsExpression != null) __obj.updateDynamic("visitTSAsExpression")(visitTSAsExpression)
    if (visitTSBigIntKeyword != null) __obj.updateDynamic("visitTSBigIntKeyword")(visitTSBigIntKeyword)
    if (visitTSBooleanKeyword != null) __obj.updateDynamic("visitTSBooleanKeyword")(visitTSBooleanKeyword)
    if (visitTSCallSignatureDeclaration != null) __obj.updateDynamic("visitTSCallSignatureDeclaration")(visitTSCallSignatureDeclaration)
    if (visitTSConditionalType != null) __obj.updateDynamic("visitTSConditionalType")(visitTSConditionalType)
    if (visitTSConstructSignatureDeclaration != null) __obj.updateDynamic("visitTSConstructSignatureDeclaration")(visitTSConstructSignatureDeclaration)
    if (visitTSConstructorType != null) __obj.updateDynamic("visitTSConstructorType")(visitTSConstructorType)
    if (visitTSDeclareFunction != null) __obj.updateDynamic("visitTSDeclareFunction")(visitTSDeclareFunction)
    if (visitTSDeclareMethod != null) __obj.updateDynamic("visitTSDeclareMethod")(visitTSDeclareMethod)
    if (visitTSEnumDeclaration != null) __obj.updateDynamic("visitTSEnumDeclaration")(visitTSEnumDeclaration)
    if (visitTSEnumMember != null) __obj.updateDynamic("visitTSEnumMember")(visitTSEnumMember)
    if (visitTSExportAssignment != null) __obj.updateDynamic("visitTSExportAssignment")(visitTSExportAssignment)
    if (visitTSExpressionWithTypeArguments != null) __obj.updateDynamic("visitTSExpressionWithTypeArguments")(visitTSExpressionWithTypeArguments)
    if (visitTSExternalModuleReference != null) __obj.updateDynamic("visitTSExternalModuleReference")(visitTSExternalModuleReference)
    if (visitTSFunctionType != null) __obj.updateDynamic("visitTSFunctionType")(visitTSFunctionType)
    if (visitTSHasOptionalTypeAnnotation != null) __obj.updateDynamic("visitTSHasOptionalTypeAnnotation")(visitTSHasOptionalTypeAnnotation)
    if (visitTSHasOptionalTypeParameterInstantiation != null) __obj.updateDynamic("visitTSHasOptionalTypeParameterInstantiation")(visitTSHasOptionalTypeParameterInstantiation)
    if (visitTSHasOptionalTypeParameters != null) __obj.updateDynamic("visitTSHasOptionalTypeParameters")(visitTSHasOptionalTypeParameters)
    if (visitTSImportEqualsDeclaration != null) __obj.updateDynamic("visitTSImportEqualsDeclaration")(visitTSImportEqualsDeclaration)
    if (visitTSImportType != null) __obj.updateDynamic("visitTSImportType")(visitTSImportType)
    if (visitTSIndexSignature != null) __obj.updateDynamic("visitTSIndexSignature")(visitTSIndexSignature)
    if (visitTSIndexedAccessType != null) __obj.updateDynamic("visitTSIndexedAccessType")(visitTSIndexedAccessType)
    if (visitTSInferType != null) __obj.updateDynamic("visitTSInferType")(visitTSInferType)
    if (visitTSInterfaceBody != null) __obj.updateDynamic("visitTSInterfaceBody")(visitTSInterfaceBody)
    if (visitTSInterfaceDeclaration != null) __obj.updateDynamic("visitTSInterfaceDeclaration")(visitTSInterfaceDeclaration)
    if (visitTSIntersectionType != null) __obj.updateDynamic("visitTSIntersectionType")(visitTSIntersectionType)
    if (visitTSLiteralType != null) __obj.updateDynamic("visitTSLiteralType")(visitTSLiteralType)
    if (visitTSMappedType != null) __obj.updateDynamic("visitTSMappedType")(visitTSMappedType)
    if (visitTSMethodSignature != null) __obj.updateDynamic("visitTSMethodSignature")(visitTSMethodSignature)
    if (visitTSModuleBlock != null) __obj.updateDynamic("visitTSModuleBlock")(visitTSModuleBlock)
    if (visitTSModuleDeclaration != null) __obj.updateDynamic("visitTSModuleDeclaration")(visitTSModuleDeclaration)
    if (visitTSNamespaceExportDeclaration != null) __obj.updateDynamic("visitTSNamespaceExportDeclaration")(visitTSNamespaceExportDeclaration)
    if (visitTSNeverKeyword != null) __obj.updateDynamic("visitTSNeverKeyword")(visitTSNeverKeyword)
    if (visitTSNonNullExpression != null) __obj.updateDynamic("visitTSNonNullExpression")(visitTSNonNullExpression)
    if (visitTSNullKeyword != null) __obj.updateDynamic("visitTSNullKeyword")(visitTSNullKeyword)
    if (visitTSNumberKeyword != null) __obj.updateDynamic("visitTSNumberKeyword")(visitTSNumberKeyword)
    if (visitTSObjectKeyword != null) __obj.updateDynamic("visitTSObjectKeyword")(visitTSObjectKeyword)
    if (visitTSOptionalType != null) __obj.updateDynamic("visitTSOptionalType")(visitTSOptionalType)
    if (visitTSParameterProperty != null) __obj.updateDynamic("visitTSParameterProperty")(visitTSParameterProperty)
    if (visitTSParenthesizedType != null) __obj.updateDynamic("visitTSParenthesizedType")(visitTSParenthesizedType)
    if (visitTSPropertySignature != null) __obj.updateDynamic("visitTSPropertySignature")(visitTSPropertySignature)
    if (visitTSQualifiedName != null) __obj.updateDynamic("visitTSQualifiedName")(visitTSQualifiedName)
    if (visitTSRestType != null) __obj.updateDynamic("visitTSRestType")(visitTSRestType)
    if (visitTSStringKeyword != null) __obj.updateDynamic("visitTSStringKeyword")(visitTSStringKeyword)
    if (visitTSSymbolKeyword != null) __obj.updateDynamic("visitTSSymbolKeyword")(visitTSSymbolKeyword)
    if (visitTSThisType != null) __obj.updateDynamic("visitTSThisType")(visitTSThisType)
    if (visitTSTupleType != null) __obj.updateDynamic("visitTSTupleType")(visitTSTupleType)
    if (visitTSType != null) __obj.updateDynamic("visitTSType")(visitTSType)
    if (visitTSTypeAliasDeclaration != null) __obj.updateDynamic("visitTSTypeAliasDeclaration")(visitTSTypeAliasDeclaration)
    if (visitTSTypeAnnotation != null) __obj.updateDynamic("visitTSTypeAnnotation")(visitTSTypeAnnotation)
    if (visitTSTypeAssertion != null) __obj.updateDynamic("visitTSTypeAssertion")(visitTSTypeAssertion)
    if (visitTSTypeLiteral != null) __obj.updateDynamic("visitTSTypeLiteral")(visitTSTypeLiteral)
    if (visitTSTypeOperator != null) __obj.updateDynamic("visitTSTypeOperator")(visitTSTypeOperator)
    if (visitTSTypeParameter != null) __obj.updateDynamic("visitTSTypeParameter")(visitTSTypeParameter)
    if (visitTSTypeParameterDeclaration != null) __obj.updateDynamic("visitTSTypeParameterDeclaration")(visitTSTypeParameterDeclaration)
    if (visitTSTypeParameterInstantiation != null) __obj.updateDynamic("visitTSTypeParameterInstantiation")(visitTSTypeParameterInstantiation)
    if (visitTSTypePredicate != null) __obj.updateDynamic("visitTSTypePredicate")(visitTSTypePredicate)
    if (visitTSTypeQuery != null) __obj.updateDynamic("visitTSTypeQuery")(visitTSTypeQuery)
    if (visitTSTypeReference != null) __obj.updateDynamic("visitTSTypeReference")(visitTSTypeReference)
    if (visitTSUndefinedKeyword != null) __obj.updateDynamic("visitTSUndefinedKeyword")(visitTSUndefinedKeyword)
    if (visitTSUnionType != null) __obj.updateDynamic("visitTSUnionType")(visitTSUnionType)
    if (visitTSUnknownKeyword != null) __obj.updateDynamic("visitTSUnknownKeyword")(visitTSUnknownKeyword)
    if (visitTSVoidKeyword != null) __obj.updateDynamic("visitTSVoidKeyword")(visitTSVoidKeyword)
    if (visitTaggedTemplateExpression != null) __obj.updateDynamic("visitTaggedTemplateExpression")(visitTaggedTemplateExpression)
    if (visitTemplateElement != null) __obj.updateDynamic("visitTemplateElement")(visitTemplateElement)
    if (visitTemplateLiteral != null) __obj.updateDynamic("visitTemplateLiteral")(visitTemplateLiteral)
    if (visitThisExpression != null) __obj.updateDynamic("visitThisExpression")(visitThisExpression)
    if (visitThisTypeAnnotation != null) __obj.updateDynamic("visitThisTypeAnnotation")(visitThisTypeAnnotation)
    if (visitThrowStatement != null) __obj.updateDynamic("visitThrowStatement")(visitThrowStatement)
    if (visitTryStatement != null) __obj.updateDynamic("visitTryStatement")(visitTryStatement)
    if (visitTupleTypeAnnotation != null) __obj.updateDynamic("visitTupleTypeAnnotation")(visitTupleTypeAnnotation)
    if (visitTypeAlias != null) __obj.updateDynamic("visitTypeAlias")(visitTypeAlias)
    if (visitTypeAnnotation != null) __obj.updateDynamic("visitTypeAnnotation")(visitTypeAnnotation)
    if (visitTypeCastExpression != null) __obj.updateDynamic("visitTypeCastExpression")(visitTypeCastExpression)
    if (visitTypeParameter != null) __obj.updateDynamic("visitTypeParameter")(visitTypeParameter)
    if (visitTypeParameterDeclaration != null) __obj.updateDynamic("visitTypeParameterDeclaration")(visitTypeParameterDeclaration)
    if (visitTypeParameterInstantiation != null) __obj.updateDynamic("visitTypeParameterInstantiation")(visitTypeParameterInstantiation)
    if (visitTypeofTypeAnnotation != null) __obj.updateDynamic("visitTypeofTypeAnnotation")(visitTypeofTypeAnnotation)
    if (visitUnaryExpression != null) __obj.updateDynamic("visitUnaryExpression")(visitUnaryExpression)
    if (visitUnionTypeAnnotation != null) __obj.updateDynamic("visitUnionTypeAnnotation")(visitUnionTypeAnnotation)
    if (visitUpdateExpression != null) __obj.updateDynamic("visitUpdateExpression")(visitUpdateExpression)
    __obj.asInstanceOf[Visitor[M]]
  }
}

